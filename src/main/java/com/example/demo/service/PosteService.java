package com.example.demo.service;

import com.example.demo.model.Poste;

import java.util.List;

public interface PosteService {
    Poste ajouterPoste(Poste poste);

    List<Poste> getPoste();

    void SupprimerPoste(Long id);
}
