package com.katonarobert.microserviceproduct.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long Id;
    private String imgSrc;
    private String description;
    // private Review review;


    public Product() {
    }
}
