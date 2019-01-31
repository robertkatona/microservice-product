package com.katonarobert.microserviceproduct.controller;

import com.katonarobert.microserviceproduct.model.Product;
import com.katonarobert.microserviceproduct.model.Review;
import com.katonarobert.microserviceproduct.service.ProductService;
import com.katonarobert.microserviceproduct.service.ReviewService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = {"http://192.168.160.164:3000"}, allowCredentials = "true")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ReviewService reviewService;

    @GetMapping(value = "/")
    @CrossOrigin(origins = {"http://192.168.160.164:3000"}, allowedHeaders = "*", allowCredentials = "true")
    public @ResponseBody List<Product> getAllProducts() {
        List<Product> all = productService.getAll();
        return all;
    }

//    TODO: Finish shopping cart
//    @GetMapping(value = "/shopping-cart/{id}")
//    public @ResponseBody List<Product> getProductsByCustomer(@PathVariable String id) {
//        List<Product> all = productService.getAllById(Integer.parseInt(id));
//        return all;
//    }

    @PostMapping(value = "/add-product")
    public void addProduct(@RequestBody String product) throws JSONException {
        JSONObject jsonObj = new JSONObject(product);
        Product newProductWithOutId = new Product(
                jsonObj.getJSONObject("product").getString("name"),
                jsonObj.getJSONObject("product").getString("imgSrc"),
                jsonObj.getJSONObject("product").getString("description"),
                jsonObj.getJSONObject("product").getDouble("price"));
        productService.add(newProductWithOutId);

    }

    @PostMapping(value = "/add-review")
    public void addReview(@RequestParam(value = "productId") String id, @RequestParam(value = "reviewValue") String reviewValue) {
        Product byId = productService.getById(Integer.parseInt(id));
        Review review = new Review(byId, reviewValue);
        byId.addReview(review);
        reviewService.add(review);

    }
}
