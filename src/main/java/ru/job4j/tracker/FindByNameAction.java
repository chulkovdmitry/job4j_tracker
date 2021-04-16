package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String itkey = input.askStr("Enter name of item to find: ");
        Item[] array = new Item[100];
        array = tracker.findByName(itkey);
        if (array.length == 0) {
            System.out.println("Items with this name not found!");
        } else {
            System.out.println("Items with this name FOUND!");
            for (Item item : array) {
                System.out.println(item);
            }
        }
        return true;
    }
}