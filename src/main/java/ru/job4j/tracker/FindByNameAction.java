package ru.job4j.tracker;

import java.util.List;

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
    public boolean execute(Input input, Store tracker) {
        String itkey = input.askStr("Enter name of item to find: ");
        List<Item> items = tracker.findByName(itkey);
        if (items.size() > 0) {
            for (Item i : items) {
                out.println(i);
            }
        } else {
            out.println("items name NOT FOUND");
        }

        return true;
    }
}