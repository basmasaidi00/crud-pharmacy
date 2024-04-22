package com.inn.ApplicationCrud.ServiceImpl;



import com.inn.ApplicationCrud.Dto.MedicamentDto;
import com.inn.ApplicationCrud.Entity.Medicament;
import com.inn.ApplicationCrud.Exception.RessourceNotFoundException;
import com.inn.ApplicationCrud.Repository.MedicamentRepository;
import com.inn.ApplicationCrud.Service.ServiceMedicament;
import com.inn.ApplicationCrud.Mapper.MedicamentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ServiceMedicamentImpl implements ServiceMedicament {
    private MedicamentRepository medicamentRepository;
    @Override
    public MedicamentDto createMedicament(MedicamentDto medicamentDto) {

        Medicament medicament = MedicamentMapper.mapToMedicament(medicamentDto);
        Medicament savedMedicament = medicamentRepository.save(medicament);
        return MedicamentMapper.mapToMedicamentDto(savedMedicament);
    }

    @Override
    public MedicamentDto getMedicamentById(Long medicamentId) {
        Medicament medicament= medicamentRepository.findById(medicamentId)
                .orElseThrow(()-> new RessourceNotFoundException("Medicament not exist with id :"+medicamentId));
        return MedicamentMapper.mapToMedicamentDto(medicament);
    }
    @Override
    public List<MedicamentDto> getAllMedicaments() {
        List<Medicament> medicaments = medicamentRepository.findAll();
        return medicaments.stream().map((medicament) -> MedicamentMapper.mapToMedicamentDto(medicament))
                .collect(Collectors.toList());
    }
    @Override
    public MedicamentDto updateMedicament(Long medicamentId, MedicamentDto updateMedicament) {
        Medicament medicament = medicamentRepository.findById(medicamentId)
                .orElseThrow(()-> new RessourceNotFoundException("medicament not exist with id :"+medicamentId));

        medicament.setId(updateMedicament.getId());


        Medicament updateMedicamentObj = medicamentRepository.save(medicament);

        return MedicamentMapper.mapToMedicamentDto(updateMedicamentObj);
    }

    @Override
    public void deleteMedicament(Long medicamentId) {
        Medicament medicament = medicamentRepository.findById(medicamentId)
                .orElseThrow(()-> new RessourceNotFoundException("employee not exist with id :"+medicamentId));
        medicamentRepository.deleteById(medicamentId);
    }



}
