package com.katonarobert.microserviceproduct.service;


import com.katonarobert.microserviceproduct.model.Review;
import com.katonarobert.microserviceproduct.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public void add(Review review) {
        reviewRepository.saveAndFlush(review);
    }
}
