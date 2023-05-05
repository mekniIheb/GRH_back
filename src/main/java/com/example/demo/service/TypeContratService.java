package com.example.demo.service;

import com.example.demo.model.TypeContrat;

import java.util.List;

public interface TypeContratService {
    TypeContrat ajouterType(TypeContrat typeContrat);

    TypeContrat getType(Long id);

    List<TypeContrat> getAllTypeContrat();

}
