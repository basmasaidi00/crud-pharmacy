package com.inn.ApplicationCrud.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DispositifMedicDto {

    private Long id;
    private String code;
    private String mc_ma;
    private String designation;
    private String conditionUB;
    private double prixEsti;
    private String qteCommande;
    private double MontantT ;
    private String chr;
    private String chp;
    private String dms_drs;
    private String observation ;


}
