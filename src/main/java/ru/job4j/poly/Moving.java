package ru.job4j.poly;

public class Moving {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle[] Vehicles = new Vehicle[]{bus1, bus2, plane1, plane2, train1, train2};
        for (Vehicle v : Vehicles) {
            v.move();
            v.drive();
        }
    }
}
