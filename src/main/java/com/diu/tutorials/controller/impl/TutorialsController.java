package com.diu.tutorials.controller.impl;

import com.diu.tutorials.controller.TutorialsAPI;
import com.diu.tutorials.model.TutorialsVO;
import com.diu.tutorials.repository.TutorialsRepository;
import com.diu.tutorials.service.TutorialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/")
@RestController
public class TutorialsController implements TutorialsAPI {

    @Autowired
    private TutorialsService tutorialsService;
    @Autowired
    private TutorialsRepository tutorialsRepository;

    @Override
    @GetMapping("/tutorials")
    public List<TutorialsVO> getAllTutorials() {
        return tutorialsService.getAllTutorials();
    }

    @Override
    @GetMapping("/tutorials/{id}")
    public Optional<TutorialsVO> getTutorialsById(@PathVariable String id) {
        return tutorialsService.getTutorialById(id);
    }

    @Override
    @GetMapping("/tutorials/published")
    public List<TutorialsVO> findByPublished() {
        return tutorialsService.findByPublished();
    }

    @Override
    @PostMapping("/tutorials")
    public TutorialsVO save(@RequestBody TutorialsVO tutorialsVO) {
        return tutorialsService.save(tutorialsVO);
    }

    @Override
    @PutMapping("/tutorials/{id}")
    public TutorialsVO update(@RequestBody TutorialsVO tutorialsVO, @PathVariable String id) {
        return tutorialsService.updateTutorial(tutorialsVO, id);
    }

    @Override
    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity deleteTutorial(@PathVariable String id) {
        tutorialsService.deleteTutorial(id);
        return new ResponseEntity<>("Tutorial has been deleted!", HttpStatus.OK);
    }


    @Override
    @DeleteMapping("/tutorials/all")
    public ResponseEntity deleteAllTutorials() {
        tutorialsService.deleteAllTutotials();
        return new ResponseEntity<>("All tutorials have been deleted!", HttpStatus.OK);
    }

}
