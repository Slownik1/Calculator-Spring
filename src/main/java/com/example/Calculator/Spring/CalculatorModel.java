package com.example.Calculator.Spring;

public class CalculatorModel {

    private int a;
    private int b;

    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "CalculatorModel{" +
                "a=" + a +
                ", b=" + b +
                ", result=" + result +
                '}';
    }
}
