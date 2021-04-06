package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To3To5Then7() {
        int first = 7;
        int second = 3;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To4To2To3Then5() {
        int first = 5;
        int second = 4;
        int third = 2;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}