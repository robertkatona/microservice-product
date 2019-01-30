package com.katonarobert.microserviceproduct.config;

import com.katonarobert.microserviceproduct.model.Product;
import com.katonarobert.microserviceproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProductsConfig {

    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    public void init() {
        Product product1 = new Product("hello.img", "This is a ....");
        Product product2 = new Product("bello.img", "This is a ....");
        productRepository.saveAndFlush(product1);
        productRepository.saveAndFlush(product2);
    }

}
