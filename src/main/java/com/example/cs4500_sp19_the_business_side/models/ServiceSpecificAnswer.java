package com.example.cs4500_sp19_the_business_side.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="service_specific_answers")
public class ServiceSpecificAnswer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Boolean trueFalseAnswer;
	private Integer maxRangeAnswer;
	private Integer minRangeAnswer;
	private Integer choiceAnswer;
	private String openEndedAnswer;
	
	@ManyToOne
	@JsonIgnore
	private ServiceSpecificQuestion serviceSpecificQuestion;
	
	@ManyToOne
	@JsonIgnore
	private User provider;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Boolean getTrueFalseAnswer() {
		return trueFalseAnswer;
	}
	
	public void setTrueFalseAnswer(Boolean trueFalseAnswer) {
		this.trueFalseAnswer = trueFalseAnswer;
	}
	
    public Integer getMaxRangeAnswer() {
        return maxRangeAnswer;
    }
    
    public void setMaxRangeAnswer(Integer maxRangeAnswer) {
        this.maxRangeAnswer = maxRangeAnswer;
    }
    
    public Integer getMinRangeAnswer() {
        return minRangeAnswer;
    }
    
    public void setMinRangeAnswer(Integer minRangeAnswer) {
        this.minRangeAnswer = minRangeAnswer;
    }
    
    public Integer getChoiceAnswer() {
        return choiceAnswer;
    }
    
    public void setChoiceAnswer(Integer choiceAnswer) {
        this.choiceAnswer = choiceAnswer;
    }
    
    public String getOpenEndedAnswer() {
    	return openEndedAnswer;
    }
    
    public void setOpenEndedAnswer(String openEndedAnswer) {
    	this.openEndedAnswer = openEndedAnswer;
    }
    
    public ServiceSpecificQuestion getServiceSpecificQuestion() {
    	return serviceSpecificQuestion;
    }
    
    public void setServiceSpecificQuestion(ServiceSpecificQuestion serviceSpecificQuestion) {
    	this.serviceSpecificQuestion = serviceSpecificQuestion;
    }
    
    public User getProvider() {
    	return provider;
    }
    
    public void setProvider(User provider) {
    	this.provider = provider;
    }
    
}
