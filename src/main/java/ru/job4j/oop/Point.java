package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
        Point c = new Point(2, 5);
        Point d = new Point(7, 9);
        System.out.println("Между точками (" + c.x + "," + c.y + ") и (" + d.x + "," + d.y + ") расстояние " + c.distance(d));
        Point e = new Point(1, 3);
        Point f = new Point(4, 6);
        System.out.println("Между точками (" + e.x + "," + e.y + ") и (" + f.x + "," + f.y + ") расстояние " + e.distance(f));
    }
}