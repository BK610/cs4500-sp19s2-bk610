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
    @GetMapping("/api/servicequestions/{questionId}")
    public ServiceSpecificQuestion findServiceSpecificQuestionById(
            @PathVariable("questionId") Integer id) {
        return serviceSpecificQuestionRepository.findServiceSpecificQuestionById(id);
    }
    @PostMapping("/api/servicequestions")
    public ServiceSpecificQuestion createServiceSpecificQuestion(@RequestBody ServiceSpecificQuestion question) {
        return serviceSpecificQuestionRepository.save(question);
    }
    @PutMapping("/api/servicequestions/{questionId}")
    public ServiceSpecificQuestion updateServiceSpecificQuestion(
            @PathVariable("questionId") Integer id,
            @RequestBody ServiceSpecificQuestion questionUpdates) {
        ServiceSpecificQuestion question = serviceSpecificQuestionRepository.findServiceSpecificQuestionById(id);
        question.setQuestionType(questionUpdates.getQuestionType());
        question.setDefaultValue(questionUpdates.getDefaultValue());
        question.setPossibleChoices(questionUpdates.getPossibleChoices());
        return serviceSpecificQuestionRepository.save(question);
    }
    @DeleteMapping("/api/servicequestions/{questionId}")
    public void deleteServiceSpecificQuestion(
            @PathVariable("questionId") Integer id) {
        serviceSpecificQuestionRepository.deleteById(id);
    }
}
