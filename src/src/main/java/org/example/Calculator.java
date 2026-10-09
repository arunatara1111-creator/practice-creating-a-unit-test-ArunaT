package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public double div(double a, double b) {
        try {
            return a / b;
        }catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        return 0;
    }
}
