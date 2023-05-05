package com.example.demo.repository;

import com.example.demo.model.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeContratRepo extends JpaRepository<TypeContrat, Long> {
}
