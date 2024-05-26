package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летит над облаками");
    }

    @Override
    public void stop() {
        System.out.println("Запрос у диспетчера свободной ВПП");
    }
}
