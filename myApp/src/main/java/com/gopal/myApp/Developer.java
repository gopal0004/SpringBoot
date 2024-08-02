package com.gopal.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired //Field injection
    @Qualifier("desktop")
    Computer cmp;

    //Constructor injection
    // public Developer(Laptop lp){
    //     this.lp = lp;
    // }

    //Setter injection
    // @Autowired
    // public void setObj(Laptop lp){
    //     this.lp = lp;
    // }

    public void build(){
        cmp.compile();
        System.out.println("working on awesome project ");
    }
}
