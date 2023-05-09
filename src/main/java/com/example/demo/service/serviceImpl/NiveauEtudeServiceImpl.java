package com.example.demo.service.serviceImpl;

import com.example.demo.model.NiveauEtude;
import com.example.demo.repository.NiveauEtudeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NiveauEtudeServiceImpl {

    private final NiveauEtudeRepo niveauEtudeRepo;


    public List<NiveauEtude> getAllNiveauETude() {
        return niveauEtudeRepo.findAll();
    }
}
