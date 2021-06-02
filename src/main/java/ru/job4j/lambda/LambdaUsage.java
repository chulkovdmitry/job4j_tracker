package ru.job4j.lambda;

import java.util.Comparator;
import java.util.Arrays;

public class LambdaUsage {

    public static void main(String[] args) {
        String[] numbers = {
                "1. Task",
                "2. Task",
                "11. Task"
        };
        Comparator<String> numStr = (left, right) -> {
            System.out.println("compare - " + right + " : " + left);
            return right.compareTo(left);
        };
        Arrays.sort(numbers, numStr);
    }
}
