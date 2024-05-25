package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void loadPassengers(int passengers);

    double fillUp(int fuel);
}
