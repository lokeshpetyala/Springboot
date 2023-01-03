package com.example.dec2022.Controller;

import jdk.jfr.Threshold;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/greet")
    public String sayHello(){
        return "Welcome to Spring-boot";
    }
    @GetMapping("/greet/{name}")
    public String sayHello(@PathVariable("name") String inputName){
        return "Hello "+inputName+", Welcome to Spring-boot";
    }
}
