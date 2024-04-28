package com.example.demovn.controller;

import com.example.demovn.models.Product;
import com.example.demovn.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("")
    List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
