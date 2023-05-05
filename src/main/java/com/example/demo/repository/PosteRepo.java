package com.example.demo.repository;

import com.example.demo.model.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteRepo extends JpaRepository<Poste, Long> {
}
