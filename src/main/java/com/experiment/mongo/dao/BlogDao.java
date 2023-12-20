package com.experiment.mongo.dao;

import com.experiment.mongo.entity.document.BlogDocument;
import com.experiment.mongo.entity.pojo.BlogPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao extends JpaRepository<BlogPojo, Integer> {

}
