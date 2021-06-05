package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FirstStream {

    public static void main(String[] args) {
        List<Integer> integers = List.of(77, -5, -2, 28, 17, -9);
        List<Integer> positive = integers.stream().filter(integer -> integer > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
