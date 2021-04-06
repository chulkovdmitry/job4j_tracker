package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private int project;

    public Engineer(String n, String s, String e, String b, int p) {
        super(n, s, e, b);
        project = 0;
    }

    public void develope(int project) {}
}
