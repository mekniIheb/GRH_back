package com.example.demo.controller;

import com.example.demo.model.TypeContrat;
import com.example.demo.service.serviceImpl.TypeContratServiceImpl;
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
public class TypeContratController {
    private final TypeContratServiceImpl contratService;

    @GetMapping("/typeContrat")

    public ResponseEntity<List<TypeContrat>> getAllList() {
        return new ResponseEntity<>(contratService.getAllTypeContrat(), HttpStatus.OK);
    }

    @GetMapping("/typeContrat/{id}")
    public ResponseEntity<TypeContrat> getTypeContratById(@PathVariable Long id) {
        return new ResponseEntity<>(contratService.getType(id), HttpStatus.OK);
    }
}
