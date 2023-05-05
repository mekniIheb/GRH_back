package com.example.demo.service;

import com.example.demo.model.Departement;

import java.util.List;

public interface DepartementService {
    Departement ajouterDepartement(Departement departement);

    List<Departement> getDepartement();

    void SupprimerDepartement(Long id);
}
