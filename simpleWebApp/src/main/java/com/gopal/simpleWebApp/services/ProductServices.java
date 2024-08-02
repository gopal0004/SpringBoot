package com.gopal.simpleWebApp.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gopal.simpleWebApp.models.Product;

@Service
public class ProductServices {

    List<Product> lst = Arrays.asList(
            (new Product(101, "Iphone", 50000)),
            (new Product(102, "Shure Mic", 10000)),
            (new Product(103, "Canon Camera", 70000)));

    public List<Product> getProducts() {
        return lst;
    }
}
