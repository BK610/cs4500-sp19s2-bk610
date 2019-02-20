package com.example.cs4500_sp19_the_business_side.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Estimate {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private float estimate;
    private float basePrice;
    private Frequency baseFrequency;
    private boolean subscription;
    private Frequency subscriptionFrequency;
    private Frequency deliveryFrequency;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getEstimate() {
        return estimate;
    }

    public void setEstimate(float estimate) {
        this.estimate = estimate;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public Frequency getBaseFrequency() {
        return baseFrequency;
    }

    public void setBaseFrequency(Frequency baseFrequency) {
        this.baseFrequency = baseFrequency;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    public Frequency getSubscriptionFrequency() {
        return subscriptionFrequency;
    }

    public void setSubscriptionFrequency(Frequency subscriptionFrequency) {
        this.subscriptionFrequency = subscriptionFrequency;
    }

    public Frequency getDeliveryFrequency() {
        return deliveryFrequency;
    }

    public void setDeliveryFrequency(Frequency deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
    }

}