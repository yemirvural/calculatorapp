package com.example.calculatorapp;

public class Calculate {
    private int number1, number2;

    public Calculate(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add(){
        return  number1 + number2;
    }

    public int subtract(){
        return  number1 - number2;
    }

    public int divide(){
        return  number1 / number2;
    }

    public int multiply(){
        return  number1 * number2;
    }
}
