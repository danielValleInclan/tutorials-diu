package com.diu.tutorials.service.impl;

import com.diu.tutorials.model.TutorialsVO;
import com.diu.tutorials.repository.TutorialsRepository;
import com.diu.tutorials.service.TutorialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialsServiceImpl implements TutorialsService {

    @Autowired
    private TutorialsRepository tutorialsRepository;


    @Override
    public List<TutorialsVO> getAllTutorials() {
        return null;
    }

    @Override
    public Optional<TutorialsVO> getTutorialById(String id) {
        return Optional.empty();
    }

    @Override
    public List<TutorialsVO> findByPublished() {
        return null;
    }

    @Override
    public TutorialsVO updateTutorial(TutorialsVO tutorialsVO) {
        return null;
    }

    @Override
    public ResponseEntity deleteTutorial(String id) {
        return null;
    }

    @Override
    public ResponseEntity deleteAllTutotials() {
        return null;
    }
}
