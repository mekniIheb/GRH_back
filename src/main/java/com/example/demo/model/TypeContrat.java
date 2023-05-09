package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TypeContrat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_TYPE_CONTRAT")
    private Long idTypeContrat;
    @Column(name = "NOM_TYPE_CONTRAT")
    private String nomTypeContrat;
}
