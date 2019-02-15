package com.example.cs4500_sp19_the_business_side.repositories;

import com.example.cs4500_sp19_the_business_side.models.ServiceSpecificAnswer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceSpecificAnswerRepository extends CrudRepository<ServiceSpecificAnswer, Integer> {
    @Query(value="SELECT serviceSpecificAnswer FROM ServiceSpecificAnswer serviceSpecificAnswer")
    public List<ServiceSpecificAnswer> findAllServiceSpecificAnswers();
    @Query(value="SELECT serviceSpecificAnswer FROM ServiceSpecificAnswer serviceSpecificAnswer WHERE serviceSpecificAnswer.id=:id")
    public ServiceSpecificAnswer findServiceSpecificAnswerById(@Param("id") Integer id);
}
