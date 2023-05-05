package com.example.demo.service.serviceImpl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.AvantageSalaire;
import com.example.demo.repository.AvantageSalaireRepo;
import com.example.demo.service.AvantageSalaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvantageSalaireServiceImpl implements AvantageSalaireService {
    private final AvantageSalaireRepo avantageSalaireRepo;


    public List<AvantageSalaire> getAvantageSalaire() {
        try {
            return avantageSalaireRepo.findAll();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get avantage salaire");
        }
    }

    public AvantageSalaire getAvantageSalaireById(Long id) {
        try {
            return avantageSalaireRepo.findById(id).get();
        } catch (Exception e) {
            throw new ResourceNotFoundException("error get avantage salaire by id");
        }
    }

}
