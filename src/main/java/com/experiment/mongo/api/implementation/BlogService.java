package com.experiment.mongo.api.implementation;

import com.experiment.mongo.api.interfaces.IBlogService;
import com.experiment.mongo.dao.BlogDao;
import com.experiment.mongo.dao.BlogRepo;
import com.experiment.mongo.entity.document.BlogDocument;
import com.experiment.mongo.entity.pojo.BlogPojo;
import com.experiment.mongo.model.data.BlogData;
import com.experiment.mongo.model.form.BlogForm;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {

    private final BlogDao blogDao;

    private final BlogRepo blogRepo;

    public BlogService(BlogDao blogDao, BlogRepo blogRepo) {
        this.blogDao = blogDao;
        this.blogRepo = blogRepo;
    }

    @Override
    public void save(BlogForm form) {
        BlogPojo pojo = new BlogPojo(null, form.getName());
        blogDao.save(pojo);
        BlogDocument document = new BlogDocument(pojo.getId(), form.getTitle(), form.getPost());
        blogRepo.save(document);
    }

    @Override
    public BlogData findById(Integer id) throws Exception {
        BlogDocument document = blogRepo.findById(id).orElseThrow(() -> new Exception(String.format("Book with ID : %d does not exist", id)));
        BlogPojo pojo = blogDao.findById(id).orElseThrow(() -> new Exception(String.format("Book with ID : %d does not exist", id)));
        return new BlogData(document.getId(), pojo.getName(), document.getTitle(), document.getPost());

    }
}
