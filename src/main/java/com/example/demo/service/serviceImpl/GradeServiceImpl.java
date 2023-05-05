package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Departement;
import com.example.demo.model.Grade;
import com.example.demo.model.User;
import com.example.demo.repository.GradeRepo;
import com.example.demo.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService {

    private final GradeRepo gradeRepo;
    public Grade ajouterGrade(Grade grade) {
        try {
            grade.setIdGrade(getNextId());
            return gradeRepo.save(grade);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur d'ajouter grade");
        }
    }


    public List<Grade> getGrade() {
        try {
            return gradeRepo.findAll();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get grade");
        }
    }

    public Grade getGradeById(Long id) {
        try {
            return gradeRepo.findById(id).get();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get grade by id");
        }
    }

    public void SupprimerGrade(Long id) {
        try {
            gradeRepo.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur de supprimer grade");
        }

    }
    public Long getNextId() {
        return gradeRepo.getNextValVeSeq();
    }
}
