package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONTRAT")
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_CONTRAT")
    private Long idContrat;
    @Column(name = "SALAIRE_DE_BASE")
    private BigDecimal salaireDeBase;
    @Column(name = "DATE_DEBUT_CONTRAT")
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date dateDebutContrat;
    @Column(name = "DATE_FIN_CONTRAT")
    private Date dateFinContrat;

    @Transient
    private List<TypeContrat> typeContrates;
}
