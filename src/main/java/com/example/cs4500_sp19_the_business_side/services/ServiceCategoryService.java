package com.example.cs4500_sp19_the_business_side.services;

import com.example.cs4500_sp19_the_business_side.models.ServiceCategory;
import com.example.cs4500_sp19_the_business_side.repositories.ServiceCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceCategoryService {
    @Autowired
    ServiceCategoryRepository serviceRepository;
    @GetMapping("/api/categories")
    public List<ServiceCategory> findAllServiceCategories() {
        return serviceRepository.findAllServiceCategories();
    }

    @GetMapping("/api/categories/{serviceCategoryId}")
    public ServiceCategory findServiceCategoryById(
            @PathVariable("serviceCategoryId") Integer id) {
        return serviceRepository.findServiceCategoryById(id);
    }

    @PostMapping("/api/categories")
    public ServiceCategory createServiceCategory(@RequestBody ServiceCategory serviceCategory) {
        return serviceRepository.save(serviceCategory);
    }

    @PutMapping("/api/categories/{serviceCategoryId}")
    public ServiceCategory updateServiceCategory(
            @PathVariable("serviceCategoryId") Integer id,
            @RequestBody ServiceCategory serviceUpdates) {
        ServiceCategory serviceCategory = serviceRepository.findServiceCategoryById(id);
        serviceCategory.setServiceCategoryName(serviceUpdates.getServiceCategoryName());
        return serviceRepository.save(serviceCategory);
    }

    @DeleteMapping("/api/categories/{serviceCategoryId}")
    public void deleteServiceCategory(
            @PathVariable("serviceCategoryId") Integer id) {
        serviceRepository.deleteById(id);
    }
}
