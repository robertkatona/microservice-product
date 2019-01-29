package com.katonarobert.microserviceproduct.controller;

import com.katonarobert.microserviceproduct.model.Product;
import com.katonarobert.microserviceproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/products")
    public List<Product> getAllProducts() {
        List<Product> all = productRepository.findAll();

        return all;
    }

}
