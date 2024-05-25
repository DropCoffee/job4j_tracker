package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportCar();
        vehicle.changeGear();
        vehicle.accelerate();
        vehicle.steer();
        vehicle.brake();
        vehicle.refill();
        Vehicle.getDragCoefficient();
        vehicle.chargeBattery();
    }
}