package com.inn.ApplicationCrud.ServiceImpl;



import com.inn.ApplicationCrud.Dto.DispositifMedicDto;
import com.inn.ApplicationCrud.Entity.DispositifMedic;
import com.inn.ApplicationCrud.Exception.RessourceNotFoundException;
import com.inn.ApplicationCrud.Repository.DispositifMedicRepository;

import com.inn.ApplicationCrud.Service.ServiceDispositifMedic;
import com.inn.ApplicationCrud.Mapper.DispositifMedicMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ServiceDispositifMedicImpl implements ServiceDispositifMedic {
    private DispositifMedicRepository dispositifMedicRepository;
    @Override
    public DispositifMedicDto createDispositifMedic(DispositifMedicDto dispositifMedicDto) {

        DispositifMedic dispositfMedic = DispositifMedicMapper.mapToDispositifMedic(dispositifMedicDto);
        DispositifMedic savedDispositifMedic = dispositifMedicRepository.save(dispositfMedic);
        return DispositifMedicMapper.mapToDispositifMedicDto(savedDispositifMedic);
    }

    @Override
    public DispositifMedicDto getDispositifMedicById(Long dispositifMedicId) {
        DispositifMedic dispositifMedic= dispositifMedicRepository.findById(dispositifMedicId)
                .orElseThrow(()-> new RessourceNotFoundException("Dispositif medical not exist with id :"+dispositifMedicId));
        return DispositifMedicMapper.mapToDispositifMedicDto(dispositifMedic);
    }
    @Override
    public List<DispositifMedicDto> getAllDispositifMedicx() {
        List<DispositifMedic> dispositifMedics = dispositifMedicRepository.findAll();
        return dispositifMedics.stream().map((dispositifMedic) -> DispositifMedicMapper.mapToDispositifMedicDto(dispositifMedic))
                .collect(Collectors.toList());
    }
    @Override
    public DispositifMedicDto updateDispositifMedic(Long dispositifId, DispositifMedicDto updateDispositifMedic) {
        DispositifMedic dispositifMedic = dispositifMedicRepository.findById(dispositifId)
                .orElseThrow(()-> new RessourceNotFoundException("Dispositif medical not exist with id :"+dispositifId));

        dispositifMedic.setId(updateDispositifMedic.getId());


        DispositifMedic updateDispositifMedicObj = dispositifMedicRepository.save(dispositifMedic);

        return DispositifMedicMapper.mapToDispositifMedicDto(updateDispositifMedicObj);
    }

    @Override
    public void deleteDispositifMedic(Long dispositifMedicId) {
        DispositifMedic dispositifMedic = dispositifMedicRepository.findById(dispositifMedicId)
                .orElseThrow(()-> new RessourceNotFoundException("Dispositif medical not exist with id :"+dispositifMedicId));
        dispositifMedicRepository.deleteById(dispositifMedicId);
    }



}
