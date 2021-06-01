package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        List<String> list = List.of("one", "two", "three",
                "four", "five", "six", "seven");

        BiConsumer<Integer, String> biCon = (in, s) -> map.put(in + 1,
                list.get(in));

        for (int j = 0; j < list.size(); j++) {
            biCon.accept(j, list.get(j));
        }
        System.out.println(map.toString());

        BiPredicate<Integer, String> biPred = (in, s) -> (in % 2 == 0 ||
                map.get(in).length() == 4);
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());

        Consumer<String> con = (sс) -> System.out.println(sс);

        Function<String, String> func = (fs) -> fs.toUpperCase();

        for (String str : sup.get()) {
            con.accept(func.apply(str));
        }
    }
}
