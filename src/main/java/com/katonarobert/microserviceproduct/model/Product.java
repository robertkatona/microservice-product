package com.katonarobert.microserviceproduct.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String imgSrc;
    private String description;
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
    private double price;


    public Product() {
    }

    public Product(String name, String imgSrc, String description, double price) {
        this.name = name;
        this.imgSrc = imgSrc;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
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

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", imgSrc='" + imgSrc + '\'' +
                ", description='" + description + '\'' +
                ", reviews=" + reviews +
                ", price=" + price +
                '}';
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
}
