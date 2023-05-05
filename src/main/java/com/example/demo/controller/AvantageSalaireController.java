package com.example.demo.controller;

import com.example.demo.model.AvantageSalaire;
import com.example.demo.service.serviceImpl.AvantageSalaireServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AvantageSalaireController {
    private final AvantageSalaireServiceImpl avantageSalaireService;

    @GetMapping("/avantageSalaire")
    public ResponseEntity<List<AvantageSalaire>> getAvantageSalaireList() {
        return new ResponseEntity<>(avantageSalaireService.getAvantageSalaire(), HttpStatus.OK);
    }

    @GetMapping("/avantageSalaire/{id}")
    public ResponseEntity<AvantageSalaire> getAvantageById(@PathVariable Long id) {
        return new ResponseEntity<>(avantageSalaireService.getAvantageSalaireById(id), HttpStatus.OK);
    }
}
