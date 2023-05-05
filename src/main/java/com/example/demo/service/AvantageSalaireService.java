package com.example.demo.service;

import com.example.demo.model.AvantageSalaire;

import java.util.List;

public interface AvantageSalaireService {

    List<AvantageSalaire> getAvantageSalaire();

    AvantageSalaire getAvantageSalaireById(Long id);

}
