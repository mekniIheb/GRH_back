package com.example.demo.service;

import com.example.demo.model.Contrat;

import java.util.List;

public interface ContratService {
    Contrat ajouterContrat(Contrat contrat);

    Contrat getContratById(Long id);

    List<Contrat> getListContrat();

    void deleteContrat(Long id);
}
