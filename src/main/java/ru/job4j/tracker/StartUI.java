package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("First");
        tracker.add(item);
        Item itemtoo = new Item();
        itemtoo.setName("Second");
        tracker.add(itemtoo);
        for (Item s : tracker.findAll())
            System.out.println(s.getId() + " " + s.getName());
        System.out.println("-------------");
        System.out.println(tracker.findById(1).getId() + " " + tracker.findById(1).getName());
    }
}
