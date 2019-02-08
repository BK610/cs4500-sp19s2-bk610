package com.example.cs4500_sp19_the_business_side.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.cs4500_sp19_the_business_side.models.ServiceSpecificQuestion;

public interface ServiceSpecificQuestionRepository extends CrudRepository<ServiceSpecificQuestion, Integer> {
	@Query(value="SELECT serviceSpecificQuestion FROM ServiceSpecificQuestion serviceSpecificQuestion")
	public List<ServiceSpecificQuestion> findAllServiceSpecificQuestions();
	@Query(value="SELECT serviceSpecificQuestion FROM ServiceSpecificQuestion serviceSpecificQuestion WHERE serviceSpecificQuestion.id=:id")
	public ServiceSpecificQuestion findServiceSpecificQuestionById(@Param("id") Integer id);
}
