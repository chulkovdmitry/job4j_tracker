package ru.job4j.poly;

public interface Transport {
    //   ехать (без параметров, без возвращаемого типа)
    void toGo();

    //   пассажиры (принимает число пассажиров, без возвращаемого типа)
    void takePassengers(int number);

    //   заправить (принимает кол-во топлива, возвращает цену)
    double toRefuel(double quantity);
}
