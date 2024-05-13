package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Is error active " + this.active);
        System.out.println("Error status " + this.status);
        System.out.println("Error message " + this.message);
    }

    public static void main(String[] args) {
        Error simpleError = new Error();
        Error logicError = new Error(true, 1, "Logic error");
        Error oldError = new Error(false, 100, "Old close error");
        simpleError.printInfo();
        logicError.printInfo();
        oldError.printInfo();
    }
}
