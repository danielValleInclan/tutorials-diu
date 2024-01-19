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
        return tutorialsRepository.findByPublished(true);
    }

    @Override
    public TutorialsVO save(TutorialsVO tutorialsVO) {
        return tutorialsRepository.save(tutorialsVO);
    }

    @Override
    public TutorialsVO updateTutorial(TutorialsVO tutorialsVO, String id) {
        tutorialsRepository.deleteById(id);
        return tutorialsRepository.save(tutorialsVO);
    }

    @Override
    public ResponseEntity deleteTutorial(String id) {
        try {
            tutorialsRepository.deleteById(id);
            return ResponseEntity.ok("Tutorial has been deleted!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error deleting tutorial: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity deleteAllTutotials() {
        try {
            tutorialsRepository.deleteAll();
            return ResponseEntity.ok("All tutorials have been deleted!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error deleting all tutorials: " + e.getMessage());
        }
    }
}
