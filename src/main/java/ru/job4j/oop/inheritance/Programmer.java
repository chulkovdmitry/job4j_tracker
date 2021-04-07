package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private int program;

    public Programmer() {
        super();
    }

    public Programmer(String name, String surname, String education, String birthday, int project, int program) {
        super(name, surname, education, birthday, project);
        this.program = 0;
    }

    public void write(int program) {}
}
