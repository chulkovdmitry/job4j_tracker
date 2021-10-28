package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    public static List<Integer> collect(Stream<Integer> data) {
        List<Integer> result = data.collect(Collectors.toList());
        return result;
    }
}
