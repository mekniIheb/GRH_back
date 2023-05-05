package com.example.demo.controller;

import com.example.demo.model.Grade;
import com.example.demo.service.serviceImpl.GradeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class GradeController {
    private final GradeServiceImpl gradeService;

    @PostMapping("/grade")
    public ResponseEntity<Grade> ajouterGrade(@Valid @RequestBody Grade grade) {
        return new ResponseEntity<>(gradeService.ajouterGrade(grade), HttpStatus.OK);
    }

    @GetMapping("/grade/{id}")
    public ResponseEntity<Grade> getGradeById(@PathVariable Long id) {
        return new ResponseEntity<>(gradeService.getGradeById(id), HttpStatus.OK);
    }

    @GetMapping("/grade")
    public ResponseEntity<List<Grade>> getAllGrade() {
        return new ResponseEntity<>(gradeService.getGrade(), HttpStatus.OK);
    }
}
