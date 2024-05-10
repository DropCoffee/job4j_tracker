package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;

    private String name;

    public String surname;

    public static final String NEW_VALUE = "";

    public Broken() {
    }

    private void echo() {
    }

    private void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    private void method(int a, int b, int c) {

    }
}