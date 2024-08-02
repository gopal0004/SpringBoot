package com.example.first.firstproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class Controller {

    @GetMapping("/get")
    public String doGet() {
        return "Hii ,from get mapping";
    }

    @PostMapping("/post")
    public String doPost() {
        return "hello, from doPost";
    }

    @PutMapping("/put")
    public String doPut() {
        return "hello, from doPost";
    }

    @DeleteMapping("/delete")
    public String doDelete(){
        return "hello it's delete mapping";
    }
}
