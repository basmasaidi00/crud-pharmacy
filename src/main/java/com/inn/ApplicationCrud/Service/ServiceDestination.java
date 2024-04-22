package com.inn.ApplicationCrud.Service;
import com.inn.ApplicationCrud.Dto.DestinationDto;


import java.util.List;


public interface ServiceDestination {
    DestinationDto createDestination(DestinationDto serviceDto);
    DestinationDto getDestinationById(Long destinationId);

    List<DestinationDto> getAllDestinations();
    DestinationDto updateDestination(Long destinationId, DestinationDto updateService);

    void deleteDestination(Long destinationId);
}

