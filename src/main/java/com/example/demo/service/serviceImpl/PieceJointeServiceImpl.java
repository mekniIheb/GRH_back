package com.example.demo.service.serviceImpl;

import com.example.demo.model.PieceJointe;
import com.example.demo.repository.PieceJointeRepo;
import com.example.demo.service.PieceJointeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PieceJointeServiceImpl implements PieceJointeService {

    private final PieceJointeRepo pieceJointeRepo;

    @Override
    public List<PieceJointe> getListePieceJointe() {
        return pieceJointeRepo.findAll();
    }

    @Override
    public PieceJointe getPieceJointeById(Long idPieceJointe) {
        return pieceJointeRepo.findById(idPieceJointe).get();
    }
}
