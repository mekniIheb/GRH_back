package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_RESPONSABLE")
    private Long idResponsable;
    @Column(name = "NOM_RESPONSABLE")
    private String nomResponsable;
    @Column(name = "ID_POSTE")
    private Long idPoste;


}
