package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.TypeContrat;
import com.example.demo.repository.TypeContratRepo;
import com.example.demo.service.TypeContratService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeContratServiceImpl implements TypeContratService {

    private final TypeContratRepo typeContratRepo;

    public TypeContrat ajouterType(TypeContrat typeContrat) {
        try {
            return typeContratRepo.save(typeContrat);
        } catch (Exception e) {
            throw new ResourceNotFoundException("erreur d'ajouter type contrat");
        }
    }


    public TypeContrat getType(Long id) {
        try {
            return typeContratRepo.findById(id).get();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error find type contrat");
        }
    }

    public List<TypeContrat> getAllTypeContrat() {
        try {
            return typeContratRepo.findAll();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get type contrat");
        }
    }

}
