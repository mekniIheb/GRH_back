package com.example.demo.controller;

import com.example.demo.model.Contrat;
import com.example.demo.service.serviceImpl.ContratServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ContratController {
    private final ContratServiceImpl contratService;

    @PostMapping("/contrat")
    public ResponseEntity<Contrat> ajouterContrat(@RequestBody Contrat contrat) {
        return new ResponseEntity<>(contratService.ajouterContrat(contrat), HttpStatus.OK);
    }

    @GetMapping("/contrat")
    public ResponseEntity<List<Contrat>> getAllContrat() {
        return new ResponseEntity<>(contratService.getListContrat(), HttpStatus.OK);
    }
}
