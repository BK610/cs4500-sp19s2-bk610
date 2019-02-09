package com.example.cs4500_sp19_the_business_side.services;


import com.example.cs4500_sp19_the_business_side.models.FrequentlyAskedAnswer;
import com.example.cs4500_sp19_the_business_side.repositories.FrequentlyAskedAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FrequentlyAskedAnswerService {
    @Autowired
    FrequentlyAskedAnswerRepository frequentlyAskedAnswerRepository;

    @GetMapping("/api/faqanswers")
    public List<FrequentlyAskedAnswer> findAllFrequentlyAskedAnswers() {
        return frequentlyAskedAnswerRepository.findAllFrequentlyAskedAnswers();
    }

    @GetMapping("/api/faqanswers/{answerId}")
    public FrequentlyAskedAnswer findFrequentlyAskedAnswerById(
            @PathVariable("answerId") Integer id) {
        return frequentlyAskedAnswerRepository.findFrequentlyAskedAnswerById(id);
    }

    @PostMapping("/api/faqanswers")
    public FrequentlyAskedAnswer createFrequentlyAskedAnswer(
            @RequestBody FrequentlyAskedAnswer frequentlyAskedAnswer) {
        return frequentlyAskedAnswerRepository.save(frequentlyAskedAnswer);
    }

    @PutMapping("/api/faqanswers/{answerId}")
    public FrequentlyAskedAnswer updateFrequentlyAskedAnswer(
            @PathVariable("answerId") Integer id,
            @RequestBody FrequentlyAskedAnswer frequentlyAskedAnswerUpdates) {
        FrequentlyAskedAnswer answer = frequentlyAskedAnswerRepository.findFrequentlyAskedAnswerById(id);
        answer.setQuestion(frequentlyAskedAnswerUpdates.getQuestion());
        answer.setUser(frequentlyAskedAnswerUpdates.getUser());
        answer.setFrequentlyAskedQuestion(frequentlyAskedAnswerUpdates.getFrequentlyAskedQuestion());
        answer.setAnswer(frequentlyAskedAnswerUpdates.getAnswer());
        return frequentlyAskedAnswerRepository.save(answer);
    }

    @DeleteMapping("/api/faqanswers/{answerId}")
    public void deleteFrequentlyAskedAnswer(@PathVariable("answerId") Integer id) {
        frequentlyAskedAnswerRepository.deleteById(id);
    }
}
