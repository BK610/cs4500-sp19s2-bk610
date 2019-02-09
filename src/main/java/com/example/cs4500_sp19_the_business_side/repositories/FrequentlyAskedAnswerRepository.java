package com.example.cs4500_sp19_the_business_side.repositories;

import com.example.cs4500_sp19_the_business_side.models.FrequentlyAskedAnswer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FrequentlyAskedAnswerRepository extends CrudRepository<FrequentlyAskedAnswer, Integer> {
    @Query(value="SELECT frequentlyAskedAnswer FROM FrequentlyAskedAnswer frequentlyAskedAnswer")
    public List<FrequentlyAskedAnswer> findAllFrequentlyAskedAnswers();
    @Query(value="SELECT frequentlyAskedAnswer FROM FrequentlyAskedAnswer frequentlyAskedAnswer WHERE frequentlyAskedAnswer.id=:id")
    public FrequentlyAskedAnswer findFrequentlyAskedAnswerById(@Param("id") Integer id);
}
