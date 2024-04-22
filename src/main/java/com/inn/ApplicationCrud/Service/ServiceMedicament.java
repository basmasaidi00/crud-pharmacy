package com.inn.ApplicationCrud.Service;

import com.inn.ApplicationCrud.Dto.MedicamentDto;
import com.inn.ApplicationCrud.Entity.Medicament;

import java.util.List;

public interface ServiceMedicament {
    MedicamentDto createMedicament(MedicamentDto medicamenDto);
    MedicamentDto getMedicamentById(Long MedicamentId);

    List<MedicamentDto> getAllMedicaments();
    MedicamentDto updateMedicament(Long MedicamentId, MedicamentDto updateMedicament);

    void deleteMedicament(Long MedicamentId);
}

