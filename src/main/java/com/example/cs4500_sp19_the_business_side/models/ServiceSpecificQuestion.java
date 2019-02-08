package com.example.cs4500_sp19_the_business_side.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="service_specific_questions")
public class ServiceSpecificQuestion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne //TODO bwehner correct?
    private ServiceCategory serviceCategory;
    @OneToMany
    private List<ServiceSpecificAnswer> serviceSpecificAnswers;
    @Enumerated(EnumType.STRING)
    private QuestionType questionType;
    private String defaultValue;
    private String possibleChoices;

    public Integer getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPossibleChoices() {
        return possibleChoices;
    }

    public void setPossibleChoices(String possibleChoices) {
        this.possibleChoices = possibleChoices;
    }
}
