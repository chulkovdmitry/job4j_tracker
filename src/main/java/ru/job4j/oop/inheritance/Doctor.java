package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private int pacient;

    public Doctor(String n, String s, String e, String b, int p) {
        super(n, s, e, b);
        pacient = 0;
    }

    public void heal(int pacient) {}
}
