package ru.job4j.stream;

import java.util.Collection;
import java.util.stream.Stream;

public class StreamMethod {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        Stream<Integer> result = data.stream();
        return result;
    }
}
