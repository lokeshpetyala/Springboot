package com.example.dec2022.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculate")
public class Calculate {
    @GetMapping("/add/{first}/{second}")
    public double add(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber){
        return firstNumber+secondNumber;
    }

    @GetMapping("/subtract/{first}/{second}")
    public double subtract(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber){
        return firstNumber-secondNumber;
    }

    @GetMapping("/division/{first}/{second}")
    public double division(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber){
        return firstNumber/secondNumber;
    }

    @GetMapping("/multiplication/{first}/{second}")
    public double multiplication(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber){
        return firstNumber*secondNumber;
    }

}
