package com.diu.tutorials.repository;

import com.diu.tutorials.model.TutorialsVO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialsRepository extends MongoRepository<TutorialsVO, String> {
    List<TutorialsVO> findByPublished();
}