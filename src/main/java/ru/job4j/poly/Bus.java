package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void toGo() {
        System.out.println("Поехали!");
    }

    @Override
    public void takePassengers(int number) {
        int passengers = number;
    }

    @Override
    public double toRefuel(double quantity) {
        double price = 44.70;
        return quantity * price;
    }
}
