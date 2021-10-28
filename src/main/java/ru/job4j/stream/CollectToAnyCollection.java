package ru.job4j.stream;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyCollection {
    public static Set<Integer> collect(Stream<Integer> data) {
        Set<Integer> result = data.collect(Collectors.toCollection(LinkedHashSet::new));
        return result;
    }
}