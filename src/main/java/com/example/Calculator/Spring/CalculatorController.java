package com.example.Calculator.Spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping (value="/add")
    public String addInsertValue(Model model){

        CalculatorModel calculatorModel = new CalculatorModel();
        model.addAttribute("calculate", calculatorModel);
        return "add";
    }

    @PostMapping(value="/add")
    public String addShowResult(@ModelAttribute("calculate") CalculatorModel calculate){
        calculate.setResult(calculatorService.add(calculate.getA(), calculate.getB()));
        System.out.print(calculate.getResult());
        return "addResult";

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
