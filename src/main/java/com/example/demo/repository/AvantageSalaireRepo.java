package com.example.demo.repository;

import com.example.demo.model.AvantageSalaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvantageSalaireRepo extends JpaRepository<AvantageSalaire, Long> {
}
