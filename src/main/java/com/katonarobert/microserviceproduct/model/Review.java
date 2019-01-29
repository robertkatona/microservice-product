package com.katonarobert.microserviceproduct.model;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @ManyToOne
    @JoinColumn(name = "fk_product")
    private Product product;
    private String reviewValue;


    public Review() {
    }

    public Review(Product product, String reviewValue) {
        this.product = product;
        this.reviewValue = reviewValue;
    }
}
