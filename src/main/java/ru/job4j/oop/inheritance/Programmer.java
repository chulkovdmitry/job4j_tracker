package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private int program;

    public Programmer(String n, String s, String e, String b, int p) {
        super(n, s, e, b, p);
        program = 0;
    }

    public void write(int program) {}
}
