package com.katonarobert.microserviceproduct.repository;

import com.katonarobert.microserviceproduct.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
