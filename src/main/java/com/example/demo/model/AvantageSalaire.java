package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

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


}
