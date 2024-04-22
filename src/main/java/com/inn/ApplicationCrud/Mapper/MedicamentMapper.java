package com.inn.ApplicationCrud.Mapper;

import com.inn.ApplicationCrud.Dto.MedicamentDto;
import com.inn.ApplicationCrud.Entity.Medicament;

public class MedicamentMapper {
    public static MedicamentDto mapToMedicamentDto(Medicament medicament){
        return new MedicamentDto(
                medicament.getId(),
                medicament.getCode(),
                medicament.getMode(),
                medicament.getDenominationCI(),
                medicament.getConditionUB(),
                medicament.getPrixEsti(),
                medicament.getQteCommande(),
                medicament.getMontantT(),
                medicament.getChr(),
                medicament.getChrCro(),
                medicament.getChp(),
                medicament.getDms(),
                medicament.getObservation()


        );
    }
    public static Medicament mapToMedicament(MedicamentDto medicamentDto){
        return new Medicament(
                medicamentDto.getId(),
                medicamentDto.getCode(),
                medicamentDto.getMode(),
                medicamentDto.getDenominationCI(),
                medicamentDto.getConditionUB(),
                medicamentDto.getPrixEsti(),
                medicamentDto.getQteCommande(),
                medicamentDto.getMontantT(),
                medicamentDto.getChr(),
                medicamentDto.getChrCro(),
                medicamentDto.getChp(),
                medicamentDto.getDms(),
                medicamentDto.getObservation()
        );
    }
}

