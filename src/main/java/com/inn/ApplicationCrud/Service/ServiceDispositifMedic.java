package com.inn.ApplicationCrud.Service;

import com.inn.ApplicationCrud.Dto.DispositifMedicDto;

import java.util.List;

public interface ServiceDispositifMedic {
    DispositifMedicDto createDispositifMedic(DispositifMedicDto dispositifMedicDto);
    DispositifMedicDto getDispositifMedicById(Long dispositifMedicId);

    List<DispositifMedicDto> getAllDispositifMedicx();
    DispositifMedicDto updateDispositifMedic(Long dispositifMedicId, DispositifMedicDto updateDispositifMedic);

    void deleteDispositifMedic(Long dispositifMedicId);


}

