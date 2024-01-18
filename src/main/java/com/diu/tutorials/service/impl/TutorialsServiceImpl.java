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
        return tutorialsRepository.findAll();
    }

    @Override
    public Optional<TutorialsVO> getTutorialById(String id) {
        return tutorialsRepository.findById(id);
    }

    @Override
    public List<TutorialsVO> findByPublished() {
        return tutorialsRepository.findByPublished();
    }

    @Override
    public TutorialsVO save(TutorialsVO tutorialsVO) {
        return tutorialsRepository.save(tutorialsVO);
    }

    @Override
    public TutorialsVO updateTutorial(TutorialsVO tutorialsVO) {
        return tutorialsRepository.save(tutorialsVO);
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
