package com.katonarobert.microserviceproduct.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @ManyToOne
    @JoinColumn(name = "fk_product")
    @JsonIgnore
    private Product product;
    private String reviewValue;

    public Review() {
    }

    public Review(Product product, String reviewValue) {
        this.product = product;
        this.reviewValue = reviewValue;
    }

    public int getId() {
        return Id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getReviewValue() {
        return reviewValue;
    }

    public void setReviewValue(String reviewValue) {
        this.reviewValue = reviewValue;
    }
}
