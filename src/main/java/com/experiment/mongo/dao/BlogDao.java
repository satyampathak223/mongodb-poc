package com.experiment.mongo.dao;

import com.experiment.mongo.entity.pojo.BlogPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao extends JpaRepository<BlogPojo, Integer> {
}
