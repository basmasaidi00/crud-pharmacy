package com.inn.ApplicationCrud.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MedicamentDto {

    private Long id;
    private String code;
    private String mode;
    private String denominationCI;
    private String conditionUB;
    private double prixEsti;
    private String qteCommande;
    private double MontantT ;
    private String chr;
    private String chrCro;
    private String chp;
    private String dms;
    private String observation ;


}
