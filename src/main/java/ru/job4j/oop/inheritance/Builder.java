package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private int building;

    public Builder(String n, String s, String e, String b, int p) {
        super(n, s, e, b, p);
        building = 0;
    }

    public void build(int building) {}
}
