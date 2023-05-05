package com.example.demo.controller;

import com.example.demo.model.Departement;
import com.example.demo.service.serviceImpl.DepartementServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class DepartementController {
    private final DepartementServiceImpl departementService;

    @PostMapping("/departement")
    public ResponseEntity<Departement> ajouterDepartement(@RequestBody Departement departement) {
        return new ResponseEntity<>(departementService.ajouterDepartement(departement), HttpStatus.OK);
    }

    @DeleteMapping("/departement/{id}")
    public ResponseEntity<HttpStatus> supprimerDepartement(@PathVariable Long id) {
        departementService.SupprimerDepartement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/departement")
    public ResponseEntity<List<Departement>> getAllDepartement() {
        return new ResponseEntity<>(departementService.getDepartement(), HttpStatus.OK);
    }
}
