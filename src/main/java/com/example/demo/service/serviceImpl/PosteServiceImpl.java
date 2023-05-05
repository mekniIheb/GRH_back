package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Poste;
import com.example.demo.repository.PosteRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PosteServiceImpl {
    private final PosteRepo posteRepo;

    public Poste ajouterPoste(Poste poste) {
        try {
            return posteRepo.save(poste);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur d'ajouter poste");
        }
    }

    public List<Poste> getPoste() {
        try {
            return posteRepo.findAll();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get poste");
        }
    }

    public void supprimerPoste(Long id) {
        try {
            posteRepo.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur de supprimer Poste");
        }

    }
}
