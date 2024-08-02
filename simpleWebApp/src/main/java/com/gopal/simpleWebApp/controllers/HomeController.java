package com.gopal.simpleWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "welcome to Gopal!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "we don't teach, we educate";
    }
}
