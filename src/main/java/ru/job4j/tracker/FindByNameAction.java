package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String itkey = input.askStr("Enter name of item to find: ");
        Item[] array = tracker.findByName(itkey);
        if (array.length == 0) {
            out.println("Items with this name not found!");
        } else {
            out.println("Items with this name FOUND!");
            for (Item item : array) {
                out.println(item);
            }
        }
        return true;
    }
}