package com.example.cs4500_sp19_the_business_side.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500_sp19_the_business_side.models.ServiceSpecificQuestion;
import com.example.cs4500_sp19_the_business_side.repositories.ServiceSpecificQuestionRepository;

@RestController
public class ServiceSpecificQuestionService {
    @Autowired
    ServiceSpecificQuestionRepository serviceSpecificQuestionRepository;
    @GetMapping("/api/servicequestions")
    public List<ServiceSpecificQuestion> findAllServiceSpecificQuestions() {
        return serviceSpecificQuestionRepository.findAllServiceSpecificQuestions();
    }

}
