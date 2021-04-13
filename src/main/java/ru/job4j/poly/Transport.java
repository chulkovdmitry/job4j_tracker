package ru.job4j.poly;

public interface Transport {
    //   ехать (без параметров, без возвращаемого типа)
    void Go();

    //   пассажиры (принимает число пассажиров, без возвращаемого типа)
    void Passengers(int number);

    //   заправить (принимает кол-во топлива, возвращает цену)
    double Refuel(double quantity);
}
