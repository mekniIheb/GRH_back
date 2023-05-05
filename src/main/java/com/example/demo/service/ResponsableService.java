package com.example.demo.service;

import com.example.demo.model.Responsable;

import java.util.List;

public interface ResponsableService {
    Responsable ajouterResponsable(Responsable responsable);

    List<Responsable> getResponsable();

    void SupprimerResponsable(Long id);
}
