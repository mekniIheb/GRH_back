package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Contrat;
import com.example.demo.repository.ContratRepo;
import com.example.demo.service.ContratService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements ContratService {
    private final ContratRepo contratRepo;

    public Contrat ajouterContrat(Contrat contrat) {
        try {
            return contratRepo.save(contrat);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur d'ajouter contrat ");
        }
    }

    public Contrat getContratById(Long id) {
        try {
            return contratRepo.findById(id).get();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get contract by id");
        }
    }

    public List<Contrat> getListContrat() {
        try {
            return contratRepo.findAll();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get list contract");
        }
    }

    public void deleteContrat(Long id) {
        try {
            contratRepo.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur de supprimer contrat");
        }
    }
}
