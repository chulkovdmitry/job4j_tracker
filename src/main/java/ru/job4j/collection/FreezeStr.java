package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean result = true;
        int count = 1;
        char[] leftToArray = left.toCharArray();
        char[] rightToArray = right.toCharArray();
        HashMap<Character, Integer> first = new HashMap();
        for (char ch : leftToArray) {
            if (!first.containsKey(ch)) {
                first.putIfAbsent(ch, count);
            } else {
                Integer co = first.get(ch) + 1;
                first.put(ch, co);
            }
        }
        for (char ch : rightToArray) {
            Integer co = first.get(ch);
            if (!first.containsKey(ch)) {
                result = false;
                break;
            }
            if (first.containsKey(ch) && co > 0) {
                first.put(ch, co - 1);
            } else {
                first.remove(ch, co);
                result = false;
                break;
            }
        }
        return result;
    }
}
