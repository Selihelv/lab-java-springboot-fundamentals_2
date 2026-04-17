package com.example.lab_wk4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/hello")
    public String greet() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String greetName(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public int addition(@PathVariable int num1, @PathVariable int num2){
        int sum = num1 + num2;
        return sum;
    }

    @GetMapping("multiply/{num1}/{num2}")
    public int multiplication(@PathVariable int num1, @PathVariable int num2){
        int product = num1 * num2;
        return product;
    }

}
