package com.katonarobert.microserviceproduct.repository;

import com.katonarobert.microserviceproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Override
    Product getOne(Integer integer);
}
