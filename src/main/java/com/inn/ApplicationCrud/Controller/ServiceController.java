package com.inn.ApplicationCrud.Controller;

import com.inn.ApplicationCrud.Dto.ServiceDto;
import com.inn.ApplicationCrud.Service.ServiceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/service")
public class ServiceController {
    private ServiceService serviceService;


    // build add service APi
    @PostMapping
    public ResponseEntity<ServiceDto> createService(@RequestBody ServiceDto serviceDto){

        ServiceDto savedService =serviceService.createService(serviceDto);
        return new ResponseEntity<>(savedService, HttpStatus.CREATED);
    }
    //Build Get  service Rest Api
    @GetMapping("{id}")
    public ResponseEntity<ServiceDto> getServiceById(@PathVariable("id") Long serviceId){
        ServiceDto serviceDto = serviceService.getServiceById(serviceId);
        return ResponseEntity.ok(serviceDto);
    }
    //build get all service  Rest api
    @GetMapping
    public ResponseEntity<List<ServiceDto>> getAllServices(){
        List<ServiceDto> services = serviceService.getAllServices();
        return ResponseEntity.ok(services);
    }
    //build update service rest api
    @PutMapping("{id}")
    public ResponseEntity<ServiceDto> updateService(@PathVariable("id") Long serviceId,
                                                    @RequestBody ServiceDto updateService){
        ServiceDto serviceDto =serviceService.updateService(serviceId,updateService);
        return  ResponseEntity.ok(serviceDto);
    }

    //build delete Service rest api
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteService(@PathVariable("id") Long serviceId){
        serviceService.deleteService(serviceId);
        return ResponseEntity.ok("employee deleted successfuly");
    }







}

