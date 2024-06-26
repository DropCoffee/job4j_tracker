package ru.job4j.oop;

public class Cat {

    private String name;

    private String food;

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void show() {
        System.out.println("Имя котенка: " + this.name + ", ел " + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);

        peppy.eat("kotleta");
        peppy.giveNick("Gav");
        peppy.show();
    }
}