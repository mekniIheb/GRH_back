package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AVANTAGE_SALAIRE")
public class AvantageSalaire {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_AVANTAGE_SALAIRE")
    private Long idAvantageSalaire;
    @Column(name = "NOM_AVANTAGE_SALAIRE")
    private String nomAvantageSalaire;
    @Column(name = "AVANTAGE_SALAIRE")
    private BigDecimal avantageSalaire;

}
