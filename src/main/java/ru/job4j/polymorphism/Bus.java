package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void loadPassengers(int passengers) {
        System.out.println(passengers + " сели в автобус");
    }

    @Override
    public double fillUp(int fuel) {
        return fuel * 3.5;
    }
}
