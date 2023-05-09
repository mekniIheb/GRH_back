package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Poste {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPoste;
    @NotEmpty(message = "nom du poste ne peut pas être vide ! ")
    private String nomPoste;

}
