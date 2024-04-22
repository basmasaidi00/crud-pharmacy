package com.inn.ApplicationCrud.Controller;

import com.inn.ApplicationCrud.Dto.MedicamentDto;
import com.inn.ApplicationCrud.Entity.Medicament;
import com.inn.ApplicationCrud.Service.ServiceMedicament;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/medicament")
public class MedicamentController {

    private ServiceMedicament serviceMedicament;


    // build add medicament APi
    @PostMapping
    public ResponseEntity<MedicamentDto> createService(@RequestBody MedicamentDto medicamentDto){

        MedicamentDto savedMedicament =serviceMedicament.createMedicament(medicamentDto);
        return new ResponseEntity<>(savedMedicament, HttpStatus.CREATED);
    }
    //Build Get     Medicament Rest Api
    @GetMapping("{id}")
    public ResponseEntity<MedicamentDto> getServiceById(@PathVariable("id") Long medicamentId){
        MedicamentDto medicamentDto = serviceMedicament.getMedicamentById(medicamentId);
        return ResponseEntity.ok(medicamentDto);
    }
    //build get all Medicament Rest api
    @GetMapping
    public ResponseEntity<List<MedicamentDto>> getAllSMedicaments(){
        List<MedicamentDto> medicaments = serviceMedicament.getAllMedicaments();
        return ResponseEntity.ok(medicaments);
    }
    //build update medicament rest api
    @PutMapping("{id}")
    public ResponseEntity<MedicamentDto> updateService(@PathVariable("id") Long medicamentId,
                                                       @RequestBody MedicamentDto updatemedicament){
        MedicamentDto medicamentDto =serviceMedicament.updateMedicament(medicamentId,updatemedicament);
        return  ResponseEntity.ok(medicamentDto);
    }

    //build delete medicament rest api
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteMedicament(@PathVariable("id") Long medicamentId){
        serviceMedicament.deleteMedicament(medicamentId);
        return ResponseEntity.ok("Medicament deleted successfuly");
    }

}
