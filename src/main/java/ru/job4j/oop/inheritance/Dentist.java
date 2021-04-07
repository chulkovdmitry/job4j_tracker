package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private int teeth;

    public Dentist() {
        super();
    }

    public Dentist(String name, String surname, String education, String birthday, int pacient, int teeth) {
        super(name, surname, education, birthday, pacient);
        this.teeth = 0;
    }

    public void treat(int teeth) {}
}
