package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        HashSet<String> orig =
                new HashSet<>(Arrays.asList(origin.replaceAll("[,.!:;]",
                        "").split(" ")));
        HashSet<String> copy = new HashSet<>(Arrays.asList(line.split(" ")));
        for (String str : copy) {
            if (!orig.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
