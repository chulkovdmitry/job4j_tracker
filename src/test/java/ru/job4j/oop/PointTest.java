package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to58then6p4() {
        double expected = 6.4;
        Point a = new Point(1, 3);
        Point b = new Point(5, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to58then5() {
        int expected = 5;
        Point a = new Point(2, 4);
        Point b = new Point(5, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}