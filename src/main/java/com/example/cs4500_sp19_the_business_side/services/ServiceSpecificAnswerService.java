package com.example.cs4500_sp19_the_business_side.services;

import com.example.cs4500_sp19_the_business_side.models.ServiceSpecificAnswer;
import com.example.cs4500_sp19_the_business_side.repositories.ServiceSpecificAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ServiceSpecificAnswerService {
    @Autowired
    ServiceSpecificAnswerRepository repository;

    @GetMapping("api/service-specific-answers")
    public List<ServiceSpecificAnswer> getServiceSpecificAnswers() {
        return repository.findAllServiceSpecificAnswers();
    }
}
