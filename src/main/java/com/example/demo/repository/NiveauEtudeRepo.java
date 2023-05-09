package com.example.demo.repository;

import com.example.demo.model.NiveauEtude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauEtudeRepo extends JpaRepository<NiveauEtude, Long> {
}
