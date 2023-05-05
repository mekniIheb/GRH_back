package com.example.demo.service;

import com.example.demo.model.PieceJointe;

import java.util.List;

public interface PieceJointeService {
    List<PieceJointe> getListePieceJointe();

    PieceJointe getPieceJointeById(Long idPieceJointe);
}
