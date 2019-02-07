package com.example.cs4500_sp19_the_business_side.repositories;

import com.example.cs4500_sp19_the_business_side.models.FrequentlyAskedQuestion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FrequentlyAskedQuestionRepository extends CrudRepository<FrequentlyAskedQuestion, Integer> {
    @Query(value="SELECT frequentlyAskedQuestion FROM FrequentlyAskedQuestion frequentlyAskedQuestion")
    public List<FrequentlyAskedQuestion> findAllFrequentlyAskedQuestions();
    @Query(value="SELECT frequentlyAskedQuestion FROM FrequentlyAskedQuestion frequentlyAskedQuestion WHERE frequentlyAskedQuestion.id=:id")
    public FrequentlyAskedQuestion findFrequentlyAskedQuestionById(@Param("id") Integer id);
}
