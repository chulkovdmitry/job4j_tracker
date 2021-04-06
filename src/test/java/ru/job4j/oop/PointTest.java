package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when000to200then2() {
        int expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when134to582then6p4() {
        double expected = 6.7;
        Point a = new Point(1, 3, 4);
        Point b = new Point(5, 8, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when246to586then5() {
        int expected = 5;
        Point a = new Point(2, 4, 6);
        Point b = new Point(5, 8, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}