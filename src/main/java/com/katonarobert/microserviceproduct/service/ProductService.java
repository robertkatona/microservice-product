package com.katonarobert.microserviceproduct.service;

import com.katonarobert.microserviceproduct.model.Product;
import com.katonarobert.microserviceproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void add(Product product) {
        productRepository.saveAndFlush(product);
    }

    public void remove(Product product) {
        productRepository.delete(product);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(int id) {
        return productRepository.getOne(id);
    }


}