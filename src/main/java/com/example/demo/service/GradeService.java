package com.example.demo.service;

import com.example.demo.model.Grade;

import java.util.List;

public interface GradeService {
    Grade ajouterGrade(Grade grade);

    List<Grade> getGrade();
    Grade getGradeById(Long id);

    void SupprimerGrade(Long id);
}
