package com.example.demo.controller;

import com.example.demo.model.Poste;
import com.example.demo.service.serviceImpl.PosteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PosteController {
    private final PosteServiceImpl posteService;

    @PostMapping("/poste")
    public ResponseEntity<Poste> ajouterPoste(@RequestBody Poste poste) {
        return new ResponseEntity<>(posteService.ajouterPoste(poste), HttpStatus.OK);
    }

    @GetMapping("/poste")
    public ResponseEntity<List<Poste>> getAllPoste() {
        return new ResponseEntity<>(posteService.getPoste(), HttpStatus.OK);
    }
    @GetMapping("/poste/{id}")
    public ResponseEntity<Poste> getPosteById(@PathVariable Long id){
        return new ResponseEntity<>(posteService.getPosteById(id),HttpStatus.OK);
    }

    @DeleteMapping("/poste/{id}")
    public ResponseEntity<HttpStatus> supprimerPoste(@PathVariable Long id) {
        posteService.supprimerPoste(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
