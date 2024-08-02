package com.gopal.simpleWebApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.simpleWebApp.models.Product;
import com.gopal.simpleWebApp.services.ProductServices;

@RestController
public class ProductController {

    @Autowired
    ProductServices services;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return services.getProducts();
    }
}
