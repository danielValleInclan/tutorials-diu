package com.diu.tutorials.controller.impl;

import com.diu.tutorials.controller.TutorialsAPI;
import com.diu.tutorials.model.TutorialsVO;
import com.diu.tutorials.repository.TutorialsRepository;
import com.diu.tutorials.service.TutorialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public class TutorialsController implements TutorialsAPI {

    @Autowired
    private TutorialsService tutorialsService;
    @Autowired
    private TutorialsRepository tutorialsRepository;

    @Override
    @GetMapping("/tutorials/")
    public List<TutorialsVO> getAllTutorials() {
        return tutorialsService.getAllTutorials();
    }

    @Override
    @GetMapping("/tutorials/{id}")
    public Optional<TutorialsVO> getTutorialsById(String id) {
        return tutorialsService.getTutorialById(id);
    }

    @Override
    @GetMapping("/tutorials/published")
    public List<TutorialsVO> findByPublished() {
        return tutorialsService.findByPublished();
    }

    @Override
    public TutorialsVO save(TutorialsVO tutorialsVO) {
        return null;
    }

    @Override
    public TutorialsVO update(TutorialsVO tutorialsVO, String id) {
        return null;
    }

    @Override
    public ResponseEntity deleteTutorial(String id) {
        return null;
    }

    @Override
    public ResponseEntity deleteAllTutorials() {
        return null;
    }
}
