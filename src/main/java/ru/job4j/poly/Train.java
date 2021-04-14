package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Управляется машинистом.");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам.");
    }
}
