package com.experiment.mongo.dao;

import com.experiment.mongo.entity.document.BlogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends MongoRepository<BlogDocument, Integer> {

}
