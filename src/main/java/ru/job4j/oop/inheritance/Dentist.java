package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private int teeth;

    public Dentist(String n, String s, String e, String b, int p) {
        super(n, s, e, b, p);
        teeth = 0;
    }

    public void treat(int teeth) {}
}
