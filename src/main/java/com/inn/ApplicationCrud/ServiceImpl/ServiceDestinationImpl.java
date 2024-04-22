package com.inn.ApplicationCrud.ServiceImpl;

import com.inn.ApplicationCrud.Dto.DestinationDto;
import com.inn.ApplicationCrud.Entity.Destination;
import com.inn.ApplicationCrud.Exception.RessourceNotFoundException;
import com.inn.ApplicationCrud.Mapper.DestinationMapper;
import com.inn.ApplicationCrud.Service.ServiceDestination;
import com.inn.ApplicationCrud.Repository.DestinationRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceDestinationImpl implements ServiceDestination {
    private DestinationRepository destinationRepository;
    @Override
    public DestinationDto createDestination(DestinationDto destinationDto) {

        Destination destination = DestinationMapper.mapToDestination(destinationDto);
        Destination savedDestination = destinationRepository.save(destination);
        return DestinationMapper.mapToDestinationDto(savedDestination);
    }

    @Override
    public DestinationDto getDestinationById(Long destinationId) {
        Destination destination = destinationRepository.findById(destinationId)
                .orElseThrow(()-> new RessourceNotFoundException("Destinion not exist with id :"+destinationId));
        return DestinationMapper.mapToDestinationDto(destination);
    }
    @Override
    public List<DestinationDto> getAllDestinations() {
        List<Destination> destinations = destinationRepository.findAll();
        return destinations.stream().map((destination) -> DestinationMapper.mapToDestinationDto(destination))
                .collect(Collectors.toList());
    }
    @Override
    public DestinationDto updateDestination(Long destinationId, DestinationDto updateDestination) {
        Destination destination = destinationRepository.findById(destinationId)
                .orElseThrow(()-> new RessourceNotFoundException("Destination not exist with id :"+destinationId));

        destination.setName(updateDestination.getName());
        destination.setType(updateDestination.getType());


        Destination updateDestinationObj = destinationRepository.save(destination);

        return DestinationMapper.mapToDestinationDto(updateDestinationObj);
    }

    @Override
    public void deleteDestination(Long destinationId) {
        Destination destination = destinationRepository.findById(destinationId)
                .orElseThrow(()-> new RessourceNotFoundException("Destination not exist with id :"+destinationId));
        destinationRepository.deleteById(destinationId);
    }
}

