package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return x - a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        Calculator calculator = new Calculator();
        return Calculator.minus(a) + Calculator.sum(a) + calculator.multiply(a) + calculator.divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperation(5));
    }
}