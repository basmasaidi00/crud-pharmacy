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
@Table(name = "dispositifMedic")
public class DispositifMedic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "mc_ma")
    private String mc_ma;
    @Column(name="designation")
    private String designation;
    @Column(name="conditionUB")
    private String conditionUB;
    @Column(name="prixEsti")
    private double prixEsti;
    @Column(name="qteCommande")
    private String qteCommande;
    @Column(name="MontantT")
    private double MontantT ;
    @Column(name="")
    private String chr;
    @Column(name="chp")
    private String chp;
    @Column(name="dms_drs")
    private String dms_drs;
    @Column(name="observation")
    private String observation ;
}
