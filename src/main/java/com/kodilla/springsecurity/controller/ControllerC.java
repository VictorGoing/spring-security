package com.kodilla.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/controller")
public class ControllerC {


    @GetMapping("m1")
    public String m1(){
        return "Hello, I'm m1!";
    }

    @GetMapping("m2")
    public String m2(){
        return "Hello, I'm m2!";
    }

    @GetMapping("m3")
    public String m3(){
        return "Hello, I'm m3!";
    }


}
