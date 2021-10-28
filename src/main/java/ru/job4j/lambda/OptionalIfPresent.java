package ru.job4j.lambda;

import java.util.*;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        if (max(data).isPresent()) System.out.println(max(data).get());
    }

    private static Optional<Integer> max(int[] data) {
        return Arrays.stream(data).boxed().max(Integer::compare);
    }
}
