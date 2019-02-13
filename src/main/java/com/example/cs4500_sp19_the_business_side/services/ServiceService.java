package com.example.cs4500_sp19_the_business_side.services;

import com.example.cs4500_sp19_the_business_side.models.Service;
import com.example.cs4500_sp19_the_business_side.models.ServiceCategory;
import com.example.cs4500_sp19_the_business_side.repositories.ServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @GetMapping("/api/services")
    public List<Service> findAllService() {
        return serviceRepository.findAllServices();
    }
    @GetMapping("/api/services/{serviceId}")
    public Service findServiceById(
            @PathVariable("serviceId") Integer id) {
        return serviceRepository.findServiceById(id);
    }
    @PostMapping("/api/services")
    public Service createService(@RequestBody Service service) {
        return serviceRepository.save(service);
    }
    @PutMapping("/api/services/{serviceId}")
    public Service updateService(
            @PathVariable("serviceId") Integer id,
            @RequestBody Service serviceUpdates) {
        Service service = serviceRepository.findServiceById(id);
        service.setTitle(serviceUpdates.getTitle());
        return serviceRepository.save(service);
    }
    @DeleteMapping("/api/services/{serviceId}")
    public void deleteService(
            @PathVariable("serviceId") Integer id) {
        serviceRepository.deleteById(id);
    }

    @GetMapping("/api/services/{cid}/service-categories")
    public List<ServiceCategory> findAllCategoriesForService(
            @PathVariable("cid") Integer cid) {
        return serviceRepository.findAllCategoriesForService(cid);
    }
}