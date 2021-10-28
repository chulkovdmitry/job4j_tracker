package ru.job4j.poly;

public interface Transport {
    void toGo();

    void takePassengers(int number);

    double toRefuel(double quantity);
}
