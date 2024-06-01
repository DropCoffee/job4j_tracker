package ru.job4j.ex;

public class FactorialRecursion {
    public static int calc(int n) {
        int number;
        if (n == 0 || n == 1) {
            number = 1;
        } else {
            number = calc(n - 1) * n;
        }
        return number;
    }

    public static void main(String[] args) {
        int result = calc(3);
        System.out.println(result);
    }
}