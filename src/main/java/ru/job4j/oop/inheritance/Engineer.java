package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private int project;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String education, String birthday, int project) {
        super(name, surname, education, birthday);
        this.project = 0;
    }

    public void develope(int project) {}
}
