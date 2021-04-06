package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private String bodypart;

    public Surgeon(String n, String s, String e, String b, int p) {
        super(n, s, e, b, p);
        bodypart = "";
    }

    public void operate(String bodypart) {}
}
