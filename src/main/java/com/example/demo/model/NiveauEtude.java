package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NiveauEtude {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idNiveauEtude;
    private String nomNiveauEtude;
}
