package com.example.cs4500_sp19_the_business_side.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.cs4500_sp19_the_business_side.models.Service;

public interface ServiceSpecificQuestionRepository {
	@Query(value="SELECT serviceSpecificQuestion FROM ServiceSpecificQuestion serviceSpecificQuestion")
	public List<Service> findAllServiceSpecificQuestions();
	@Query(value="SELECT serviceSpecificQuestion FROM ServiceSpecificQuestion serviceSpecificQuestion WHERE serviceSpecificQuestion.id=:id")
	public Service findServiceSpecificQuestionById(@Param("id") Integer id);
}
