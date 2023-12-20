package com.experiment.mongo.api.interfaces;

import com.experiment.mongo.model.data.BlogData;
import com.experiment.mongo.model.form.BlogForm;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogService {
    public void save(BlogForm form);

    public BlogData findById(Integer id) throws Exception;

}
