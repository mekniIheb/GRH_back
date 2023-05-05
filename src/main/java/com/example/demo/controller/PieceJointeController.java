package com.example.demo.controller;

import com.example.demo.model.PieceJointe;
import com.example.demo.service.serviceImpl.PieceJointeServiceImpl;
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
public class PieceJointeController {
    private final PieceJointeServiceImpl pieceJointeService;

    @GetMapping("/pieceJointe")
    public ResponseEntity<List<PieceJointe>> getAllPieceJointe() {
        return new ResponseEntity<>(pieceJointeService.getListePieceJointe(), HttpStatus.OK);
    }

    @GetMapping("/pieceJointe/{id}")
    public ResponseEntity<PieceJointe> getPieceJointeById(@PathVariable Long id) {
        return new ResponseEntity<>(pieceJointeService.getPieceJointeById(id), HttpStatus.OK);
    }

}
