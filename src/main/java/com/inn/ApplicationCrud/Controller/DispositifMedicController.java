package com.inn.ApplicationCrud.Controller;

import com.inn.ApplicationCrud.Dto.DispositifMedicDto;
import com.inn.ApplicationCrud.Entity.DispositifMedic;
import com.inn.ApplicationCrud.Service.ServiceDispositifMedic;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/dispositifMedic")
public class DispositifMedicController {

    private ServiceDispositifMedic serviceDispositifMedic;


    // build add Dispositif medicament APi
    @PostMapping
    public ResponseEntity<DispositifMedicDto> createService(@RequestBody DispositifMedicDto dispositifMedicDto){

        DispositifMedicDto savedDispositifMedic =serviceDispositifMedic.createDispositifMedic(dispositifMedicDto);
        return new ResponseEntity<>(savedDispositifMedic, HttpStatus.CREATED);
    }
    //Build Get dispositif medicament Rest Api
    @GetMapping("{id}")
    public ResponseEntity<DispositifMedicDto> getServiceById(@PathVariable("id") Long dispositifMedicId){
        DispositifMedicDto dispositifMedicDto = serviceDispositifMedic.getDispositifMedicById(dispositifMedicId);
        return ResponseEntity.ok(dispositifMedicDto);
    }
    //build get all dispositif medicament Rest api
    @GetMapping
    public ResponseEntity<List<DispositifMedicDto>> getAllDispositifMedicx(){
        List<DispositifMedicDto>dispositifMedicx= serviceDispositifMedic.getAllDispositifMedicx();
        return ResponseEntity.ok(dispositifMedicx);
    }
    //build update dispositif medical rest api
    @PutMapping("{id}")
    public ResponseEntity<DispositifMedicDto> updateService(@PathVariable("id") Long dispositifMedicId,
                                                       @RequestBody DispositifMedicDto updateDispositifMedic){
        DispositifMedicDto dispositifMedicDto =serviceDispositifMedic.updateDispositifMedic(dispositifMedicId,updateDispositifMedic);
        return  ResponseEntity.ok(dispositifMedicDto);
    }

    //build delete dispositif  medical rest api
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteDispositif(@PathVariable("id") Long dispositifMedicId){
        serviceDispositifMedic.deleteDispositifMedic(dispositifMedicId);
        return ResponseEntity.ok("Dispostif medical deleted successfuly");
    }

}
