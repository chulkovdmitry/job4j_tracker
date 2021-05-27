package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        int i = 1;
        List<String> first = Arrays.asList(left.split(""));
        List<String> second = Arrays.asList(right.split(""));
        Collections.sort(first);
        Collections.sort(second);
        Map<Integer, String> hashMapFirst = new HashMap<>();
        for (String str : first) {
            hashMapFirst.put(i++, str);
        }
        i = 1;
        Map<Integer, String> hashMapSecond = new HashMap<>();
        for (String str : second) {
            hashMapSecond.put(i++, str);
        }
        return hashMapFirst.equals(hashMapSecond);
    }
}
