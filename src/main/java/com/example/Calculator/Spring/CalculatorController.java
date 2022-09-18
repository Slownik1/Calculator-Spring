package com.example.Calculator.Spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(value="/index")
    public String index(){
        return "index";
    }

    @PostMapping ("/add")
    public int add(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return calculatorService.add(a, b);
        return "add";
    }

    @GetMapping("/minus")
    public int minus(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return calculatorService.minus(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        if(a!=0) {
            return calculatorService.divide(a, b);
        }
        else{
            log.error("CAN NOT DIVIDE BY 0 !!!");
            return 0;
        }
    }

}
