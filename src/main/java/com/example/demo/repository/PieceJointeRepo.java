package com.example.demo.repository;

import com.example.demo.model.PieceJointe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieceJointeRepo extends JpaRepository<PieceJointe, Long> {
}
