package com.example.demo.repository;

import com.example.demo.model.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepo extends JpaRepository<Responsable, Long> {
}
