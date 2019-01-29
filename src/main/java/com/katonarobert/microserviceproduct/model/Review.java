package com.katonarobert.microserviceproduct.model;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private int Id;
    @ManyToOne
    @JoinColumn(name = "fk_product")
    private Product product;
    private int reviewValue;


    public Review() {
    }

}
