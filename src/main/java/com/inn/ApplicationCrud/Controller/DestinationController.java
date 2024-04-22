package com.inn.ApplicationCrud.Controller;

import com.inn.ApplicationCrud.Dto.DestinationDto;
import com.inn.ApplicationCrud.Entity.Destination;
import com.inn.ApplicationCrud.Service.ServiceDestination;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping
public class DestinationController {
    private ServiceDestination serviceDestination;


    // build add destination APi
    @PostMapping
    public ResponseEntity<DestinationDto> createDestination(@RequestBody DestinationDto destinationDto){

        DestinationDto savedDestination =serviceDestination.createDestination(destinationDto);
        return new ResponseEntity<>(savedDestination, HttpStatus.CREATED);
    }
    //Build Get  destination Rest Api
    @GetMapping("{id}")
    public ResponseEntity<DestinationDto> getDestinationById(@PathVariable("id") Long destinationId){
        DestinationDto destinationDto = serviceDestination.getDestinationById(destinationId);
        return ResponseEntity.ok(destinationDto);
    }
    //build get all destinatins  Rest api
    @GetMapping
    public ResponseEntity<List<DestinationDto>> getAllDestinations(){
        List<DestinationDto> destinations = serviceDestination.getAllDestinations();
        return ResponseEntity.ok(destinations);
    }
    //build update destination rest api
    @PutMapping("{id}")
    public ResponseEntity<DestinationDto> updateService(@PathVariable("id") Long destinationId,
                                                    @RequestBody DestinationDto updateDestination){
        DestinationDto destinationDto =serviceDestination.updateDestination(destinationId,updateDestination);
        return  ResponseEntity.ok(destinationDto);
    }

    //build delete Destination rest api
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteDestination(@PathVariable("id") Long destinationId){
        serviceDestination.deleteDestination(destinationId);
        return ResponseEntity.ok("destination deleted successfuly");
    }







}

