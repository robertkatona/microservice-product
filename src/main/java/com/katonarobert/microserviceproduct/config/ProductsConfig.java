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
        Product product1 = new Product("Shit","hello.img", "This is a ....", 50.0);
        Product product2 = new Product("ShitToo","bello.img", "This is a ....", 100.0);
        productRepository.saveAndFlush(product1);
        productRepository.saveAndFlush(product2);
    }

}
