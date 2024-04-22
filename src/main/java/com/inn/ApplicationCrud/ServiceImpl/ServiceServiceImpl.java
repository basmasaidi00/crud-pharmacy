package com.inn.ApplicationCrud.ServiceImpl;

import com.inn.ApplicationCrud.Dto.ServiceDto;
import com.inn.ApplicationCrud.Entity.Service;
import com.inn.ApplicationCrud.Exception.RessourceNotFoundException;
import com.inn.ApplicationCrud.Mapper.ServiceMapper;
import com.inn.ApplicationCrud.Repository.ServiceRepository;
import com.inn.ApplicationCrud.Service.ServiceService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceServiceImpl implements ServiceService {
    private ServiceRepository serviceRepository;
    @Override
    public ServiceDto createService(ServiceDto serviceDto) {

        Service service = ServiceMapper.mapToService(serviceDto);
        Service savedService = serviceRepository.save(service);
        return ServiceMapper.mapToServiceDto(savedService);
    }

    @Override
    public ServiceDto getServiceById(Long serviceId) {
        Service service = serviceRepository.findById(serviceId)
                .orElseThrow(()-> new RessourceNotFoundException("Service not exist with id :"+serviceId));
        return ServiceMapper.mapToServiceDto(service);
    }
    @Override
    public List<ServiceDto> getAllServices() {
        List<Service> services = serviceRepository.findAll();
        return services.stream().map((service) -> ServiceMapper.mapToServiceDto(service))
                .collect(Collectors.toList());
    }
    @Override
    public ServiceDto updateService(Long serviceId, ServiceDto updateService) {
        Service service = serviceRepository.findById(serviceId)
                .orElseThrow(()-> new RessourceNotFoundException("Service not exist with id :"+serviceId));

        service.setName(updateService.getName());


        Service updateServiceObj = serviceRepository.save(service);

        return ServiceMapper.mapToServiceDto(updateServiceObj);
    }

    @Override
    public void deleteService(Long serviceId) {
        Service service = serviceRepository.findById(serviceId)
                .orElseThrow(()-> new RessourceNotFoundException("Service not exist with id :"+serviceId));
        serviceRepository.deleteById(serviceId);
    }
}
