package com.katonarobert.microserviceproduct.repository;

import com.katonarobert.microserviceproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
