package com.experiment.mongo.rest;

import com.experiment.mongo.api.interfaces.IBlogService;
import com.experiment.mongo.model.data.BlogData;
import com.experiment.mongo.model.form.BlogForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @PostMapping("/create")
    public void createBlog(BlogForm form) {
        blogService.save(form);
    }

    @GetMapping("/{id}")
    public BlogData findBlogById(@PathVariable Integer id) throws Exception {
        return blogService.findById(id);
    }
}
