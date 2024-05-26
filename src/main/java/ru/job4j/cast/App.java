package ru.job4j.cast;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {new Bus(), new Train(), new Airplane(),
                new Train(), new Bus(), new Airplane()};
        for (Vehicle vehicle : vehicles) {
            System.out.println("Транспорт " + vehicle + " движется.");
            vehicle.move();
            vehicle.stop();
        }
    }
}
