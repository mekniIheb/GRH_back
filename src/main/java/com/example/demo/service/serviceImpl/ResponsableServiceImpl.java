package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Responsable;
import com.example.demo.repository.ResponsableRepo;
import com.example.demo.service.ResponsableService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResponsableServiceImpl implements ResponsableService {

    private final ResponsableRepo responsableRepo;

    public Responsable ajouterResponsable(Responsable responsable) {
        try {
            return responsableRepo.save(responsable);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur d'ajouter responsable");
        }
    }

    public List<Responsable> getResponsable() {
        try {
            return responsableRepo.findAll();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get responsable");
        }
    }

    public void SupprimerResponsable(Long id) {
        try {
            responsableRepo.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur de supprimer responsable");
        }

    }
}
