package com.example.Calculator.Spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CalculatorController {

    private CalculatorService calculatorService;

    @GetMapping("/add")
    public void add(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        System.out.println(a+b);
    }

}
