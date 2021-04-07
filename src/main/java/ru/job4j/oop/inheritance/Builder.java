package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private int building;

    public Builder(){
        super();
    }

    public Builder(String name, String surname, String education, String birthday, int project, int building) {
        super(name, surname, education, birthday, project);
        this.building = 0;
    }

    public void build(int building) {}
}
