package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Departement;
import com.example.demo.model.Grade;
import com.example.demo.repository.DepartementRepo;
import com.example.demo.service.DepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartementServiceImpl implements DepartementService {
    private final DepartementRepo departementRepo;

    public Departement ajouterDepartement(Departement departement) {
        try {
            return departementRepo.save(departement);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur d'ajouter departement");
        }
    }

    public List<Departement> getDepartement() {
        try {
            return departementRepo.findAll();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get departement");
        }
    }

    public void SupprimerDepartement(Long id) {
        try {
            departementRepo.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur de supprimer departement ");
        }
    }
}
