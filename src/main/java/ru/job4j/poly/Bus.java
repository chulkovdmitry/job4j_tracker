package ru.job4j.poly;

public class Bus implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Управляется шофёром.");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам.");
    }
}

