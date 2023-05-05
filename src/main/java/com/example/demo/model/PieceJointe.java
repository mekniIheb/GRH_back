package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PIECE_JOINTE")
public class PieceJointe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_PIECE_JOINTE")
    private Long idPieceJointe;
    private String name;

    private String type;

    @Lob
    private byte[] data;
    @Column(name = "ID_COLLABORATEUR")
    private Long idCollaborateur;
}
