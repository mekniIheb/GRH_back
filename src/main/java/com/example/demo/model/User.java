package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "collaborateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_COLLABORATEUR")
    private Long idCollaborateur;

    @CreationTimestamp
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date creeA;

    @UpdateTimestamp
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date modifieeA;

    @Column(length = 8, name = "CIN")
    private Long cin;

    @Column(name = "NOM_COMPLET")
    private String nomComplet;

    @Column(length = 13, name = "NUMERO_DU_COMPTE")
    private Long numeroDuCompte;

    @Column(length = 15, name = "NUMERO_SECURITE_SOCIALE")
    private Long numeroSecuriteSociale;

    @Column(length = 8, name = "NUMERO_TELEPHONE")
    private Long numeroTelephone;

    @JsonFormat(pattern = "dd/mm/yyyy")
    @Column(name = "DATE_DE_NAISSANCE")
    private Date dateDeNaissance;

    @Column(name = "ADRESSE")
    private String adresse;

    @Email(message = "email n'est pas valide !")
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NATURE_ETUDE")
    private String natureEtude;

    @Column(name = "CERTIFICATIONS")
    private String certifications;

    @Column(name = "ANNEE_EXPERIENCE")
    private Long anneeExperience;
    private Boolean recomendation;
    private String collaborateur;
    private String commentaire;
    private String anciennete;
    @Column(name = "SALAIRE_DE_BASE")
    private BigDecimal salaireDeBase;
    @Column(name = "DATE_DEBUT_CONTRAT")
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date dateDebutContrat;
    @Column(name = "DATE_FIN_CONTRAT")
    private Date dateFinContrat;
    private boolean status;
    private Long idTypeContrat;
    private Long idAvantageSalaire;
    private Long idNiveauEtude;
    private Long idPoste;
    private Long idResponsable;
    private Long idDepartement;


    @Transient
    private List<PieceJointe> pieceJointes;
}
