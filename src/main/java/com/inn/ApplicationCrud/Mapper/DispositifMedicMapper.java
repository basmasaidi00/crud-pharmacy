package com.inn.ApplicationCrud.Mapper;


import com.inn.ApplicationCrud.Dto.DispositifMedicDto;

import com.inn.ApplicationCrud.Entity.DispositifMedic;

public class DispositifMedicMapper {
    public static DispositifMedicDto mapToDispositifMedicDto(DispositifMedic dispositifMedic){
        return new DispositifMedicDto(
                dispositifMedic.getId(),
                dispositifMedic.getCode(),
                dispositifMedic.getMc_ma(),
                dispositifMedic.getDesignation(),
                dispositifMedic.getConditionUB(),
                dispositifMedic.getPrixEsti(),
                dispositifMedic.getQteCommande(),
                dispositifMedic.getMontantT(),
                dispositifMedic.getChr(),

                dispositifMedic.getChp(),
                dispositifMedic.getDms_drs(),
                dispositifMedic.getObservation()


        );
    }
    public static DispositifMedic mapToDispositifMedic(DispositifMedicDto dispositifMedicDto){
        return new DispositifMedic(
                dispositifMedicDto.getId(),
                dispositifMedicDto.getCode(),
                dispositifMedicDto.getMc_ma(),
                dispositifMedicDto.getDesignation(),
                dispositifMedicDto.getConditionUB(),
                dispositifMedicDto.getPrixEsti(),
                dispositifMedicDto.getQteCommande(),
                dispositifMedicDto.getMontantT(),
                dispositifMedicDto.getChr(),

                dispositifMedicDto.getChp(),
                dispositifMedicDto.getDms_drs(),
                dispositifMedicDto.getObservation()
        );
    }
}

