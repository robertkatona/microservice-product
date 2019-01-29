package com.katonarobert.microserviceproduct.controller;

import com.katonarobert.microserviceproduct.model.Product;
import com.katonarobert.microserviceproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public @ResponseBody List<Product> getAllProducts() {
        List<Product> all = productService.getAll();
        return all;
    }

    @PostMapping(value = "/products/add-product")
    public void addProduct(@RequestBody Product product)
    {
        System.out.println(product);
        Product newProductWithOutId = new Product(product.getImgSrc(), product.getDescription());
        productService.add(newProductWithOutId);
    }
}
