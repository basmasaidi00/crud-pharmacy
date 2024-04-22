package com.inn.ApplicationCrud.Mapper;
import com.inn.ApplicationCrud.Dto.ServiceDto;
import com.inn.ApplicationCrud.Entity.Service;
public class ServiceMapper {
    public static ServiceDto mapToServiceDto(Service service){
        return new ServiceDto(
                service.getId(),
                service.getName()

        );
    }
    public static Service mapToService(ServiceDto serviceDto){
        return new Service(
                serviceDto.getId(),
                serviceDto.getName()
        );
    }

}
