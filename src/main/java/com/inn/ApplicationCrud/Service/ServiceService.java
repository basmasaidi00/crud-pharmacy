package com.inn.ApplicationCrud.Service;
import com.inn.ApplicationCrud.Dto.ServiceDto;

import java.util.List;


public interface ServiceService {
    ServiceDto createService(ServiceDto serviceDto);
    ServiceDto getServiceById(Long serviceId);

    List<ServiceDto> getAllServices();
    ServiceDto updateService(Long serviceId, ServiceDto updateService);

    void deleteService(Long serviceId);
}

