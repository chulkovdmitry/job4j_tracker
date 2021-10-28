package ru.job4j.lambda;

import java.util.*;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        int rsl;
        if (indexOf(data, el).isEmpty())
            rsl = -1;
        else
            rsl = indexOf(data, el).get() - 1;
        return rsl;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        return Arrays.stream(data)
                .filter((n) -> (n) == el)
                .boxed().findFirst();
    }
}
