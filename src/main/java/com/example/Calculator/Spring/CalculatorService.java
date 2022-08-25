package com.example.Calculator.Spring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b){
        return a+b;
    }

    public int minus(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }
}
