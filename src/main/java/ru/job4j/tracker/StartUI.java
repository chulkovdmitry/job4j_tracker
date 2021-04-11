package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setId(10);
        item.setName("Bug");
        System.out.println(item);
    }
}
