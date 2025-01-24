package org.example;

public class Calculator {
    static double sum(double num1, double num2) {
        return num1 + num2;
    }

    static double substraction(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    static double division(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) throw new ArithmeticException("Division by zero is a metaphysical impossibility");
        return num1 / num2;
    }

    static long factorial(long num1) throws IllegalArgumentException {
        if (num1 < 0) throw new IllegalArgumentException();
        else if (num1 == 0) return 1;
        else if (num1 == 1) return 1;
        else return num1 * factorial(num1 - 1);
    }

    static double logNeper(double num1) throws IllegalArgumentException {
        if (num1 <= 0) throw new IllegalArgumentException();
        else return Math.log(num1);
    }
}
