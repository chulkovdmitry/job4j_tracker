package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Управляется лётчиком.");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху.");
    }
}