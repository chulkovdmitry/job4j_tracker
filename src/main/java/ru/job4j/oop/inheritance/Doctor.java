package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private int pacient;

    public Doctor(){
        super();
    }

    public Doctor(String name, String surname, String education, String birthday, int pacient) {
        super(name, surname, education, birthday);
        this.pacient = 0;
    }

    public void heal(int pacient) {}
}
