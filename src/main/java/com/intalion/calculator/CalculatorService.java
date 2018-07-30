package com.intalion.calculator;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService implements CalculatorServiceInterface {

    public double add(double number1, double secondNumber) {
        return number1 + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        System.out.println(firstNumber / secondNumber);
        return firstNumber / secondNumber;
    }
}
