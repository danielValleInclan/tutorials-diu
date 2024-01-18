package com.diu.tutorials.service;

import com.diu.tutorials.model.TutorialsVO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface TutorialsService {
    List<TutorialsVO> getAllTutorials();
    Optional<TutorialsVO> getTutorialById(String id);
    List<TutorialsVO> findByPublished();
    TutorialsVO updateTutorial(TutorialsVO tutorialsVO);
    ResponseEntity deleteTutorial(String id);
    ResponseEntity deleteAllTutotials();

}
