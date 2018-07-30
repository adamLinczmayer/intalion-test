package com.intalion.calculator;

import org.springframework.stereotype.Component;

@Component
public interface CalculatorServiceInterface{

    double add(double firstNumber, double secondNumber);

    double subtract(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double divide(double firstNumber, double secondNumber);
}