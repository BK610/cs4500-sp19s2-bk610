package com.example.cs4500_sp19_the_business_side.services;

import com.example.cs4500_sp19_the_business_side.models.FrequentlyAskedQuestion;
import com.example.cs4500_sp19_the_business_side.repositories.FrequentlyAskedQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FrequentlyAskedQuestionService {
    @Autowired
    FrequentlyAskedQuestionRepository frequentlyAskedQuestionRepository;

    @GetMapping("/api/faqs")
    public List<FrequentlyAskedQuestion> findAllFrequentlyAskedQuestions() {
        return frequentlyAskedQuestionRepository.findAllFrequentlyAskedQuestions();
    }

    @GetMapping("/api/faqs/{faqId}")
    public FrequentlyAskedQuestion findFrequentlyAskedQuestionById(
            @PathVariable("faqId") Integer id) {
        return frequentlyAskedQuestionRepository.findFrequentlyAskedQuestionById(id);
    }

    @PostMapping("/api/faqs")
    public FrequentlyAskedQuestion createFrequentlyAskedQuestion(
            @RequestBody FrequentlyAskedQuestion frequentlyAskedQuestion) {
        return frequentlyAskedQuestionRepository.save(frequentlyAskedQuestion);
    }

    @PutMapping("/api/faqs/{faqId}")
    public FrequentlyAskedQuestion updateFrequentlyAskedQuestion(
            @PathVariable("faqId") Integer id,
            @RequestBody FrequentlyAskedQuestion frequentlyAskedQuestionUpdates) {
        FrequentlyAskedQuestion faq = frequentlyAskedQuestionRepository.findFrequentlyAskedQuestionById(id);
        faq.setQuestion(frequentlyAskedQuestionUpdates.getQuestion());
        faq.setTitle(frequentlyAskedQuestionUpdates.getTitle());
        return frequentlyAskedQuestionRepository.save(faq);
    }

    @DeleteMapping("/api/faqs/{faqId}")
    public void deleteFrequentlyAskedQuestion(@PathVariable("faqId") Integer id) {
        frequentlyAskedQuestionRepository.deleteById(id);
    }
}
