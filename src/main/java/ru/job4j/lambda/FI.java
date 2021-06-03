package ru.job4j.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.function.*;

public class FI {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int i = start; i < end; i++) {
            double f = func.apply((double) i);
            rsl.add(f);
        }
        return rsl;
    }
}
