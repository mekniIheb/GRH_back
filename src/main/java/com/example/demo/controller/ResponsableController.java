package com.example.demo.controller;

import com.example.demo.model.Responsable;
import com.example.demo.service.serviceImpl.ResponsableServiceImpl;
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
public class ResponsableController {

    private final ResponsableServiceImpl responsableService;

    @GetMapping("/responsable")
    public ResponseEntity<List<Responsable>> getAllResponsables() {
        return new ResponseEntity<>(responsableService.getResponsable(), HttpStatus.OK);
    }

    @GetMapping("/responsable/{id}")
    public ResponseEntity<Responsable> getById(@PathVariable Long id) {
        return new ResponseEntity<>(responsableService.getById(id), HttpStatus.OK);
    }
}
