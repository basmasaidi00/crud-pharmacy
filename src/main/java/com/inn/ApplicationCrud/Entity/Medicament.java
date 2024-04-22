package com.inn.ApplicationCrud.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Medicament")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name="mode")
    private String mode;
    @Column(name="denominationCI")
    private String denominationCI;
    @Column(name="conditUB")
    private String conditionUB;
    @Column(name="prixEsti")
    private double prixEsti;
    @Column(name="qteCommande")
    private String qteCommande;
    @Column(name="MontantT")
    private double MontantT ;
    @Column(name="chr")
    private String chr;
    @Column(name="chr_cro")
    private String chrCro;
    @Column(name="chp")
    private String chp;
    @Column(name="dms")
    private String dms;
    @Column(name="Observation")
    private String observation ;

}

