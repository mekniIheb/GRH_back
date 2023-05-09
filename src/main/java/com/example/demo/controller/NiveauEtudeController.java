package com.example.demo.controller;

import com.example.demo.model.NiveauEtude;
import com.example.demo.service.serviceImpl.NiveauEtudeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class NiveauEtudeController {
    private final NiveauEtudeServiceImpl niveauEtudeService;
@GetMapping("/niveauEtude")
    public ResponseEntity<List<NiveauEtude>> getAll() {
        return new ResponseEntity<>(niveauEtudeService.getAllNiveauETude(), HttpStatus.OK);
    }
}
