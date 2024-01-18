package com.diu.tutorials.controller;

import com.diu.tutorials.model.TutorialsVO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface TutorialsAPI {

    List<TutorialsVO> getAllTutorials();
    Optional<TutorialsVO> getTutorialsById(String id);
    List<TutorialsVO> findByPublished();
    TutorialsVO save(TutorialsVO tutorialsVO);
    TutorialsVO update(TutorialsVO tutorialsVO, String id);
    ResponseEntity deleteTutorial(String id);
    ResponseEntity deleteAllTutorials();
}
