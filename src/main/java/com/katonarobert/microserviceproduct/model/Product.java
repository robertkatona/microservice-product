package com.katonarobert.microserviceproduct.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int Id;
    private String imgSrc;
    private String description;
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;


    public Product() {
    }

    public Product(String imgSrc, String description) {
        this.imgSrc = imgSrc;
        this.description = description;
        this.reviews = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public String getDescription() {
        return description;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", imgSrc='" + imgSrc + '\'' +
                ", description='" + description + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
