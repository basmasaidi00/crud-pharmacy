package com.inn.ApplicationCrud.Mapper;
import com.inn.ApplicationCrud.Dto.DestinationDto;
import com.inn.ApplicationCrud.Entity.Destination;
public class DestinationMapper {
    public static DestinationDto mapToDestinationDto(Destination destination){
        return new DestinationDto(
                destination.getId(),
                destination.getName(),
                destination.getType()

        );
    }
    public static Destination mapToDestination(DestinationDto destinationDto){
        return new Destination(
                destinationDto.getId(),
                destinationDto.getName(),
                destinationDto.getType()

        );
    }

}

