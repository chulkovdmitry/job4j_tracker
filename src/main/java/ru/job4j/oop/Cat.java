package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show(String name, String food) {
        System.out.println(name + " ate a " + food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.show("Gav", "kotleta");
        gav.giveNick("Mumu");
        System.out.println("Now Gav is " + gav.name);
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show("Black", "fish");
    }
}
