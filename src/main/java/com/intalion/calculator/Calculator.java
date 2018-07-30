package com.intalion.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Calculator {

    @Autowired
    private CalculatorService calculatorService;

    public double add(double firstNumber, double secondNumber) {
        return calculatorService.add(firstNumber, secondNumber);
    }

    public double substract(double firstNumber, double secondNumber) {
        return calculatorService.subtract(firstNumber, secondNumber);
    }

    public double multiply(double firstNumber, double secondNumber) {
        return calculatorService.multiply(firstNumber, secondNumber);
    }

    public double divide(double firstNumber, double secondNumber) {
        return calculatorService.divide(firstNumber, secondNumber);
    }
}