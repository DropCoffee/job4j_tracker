package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет по трассе");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаемся на остановке");
    }
}
