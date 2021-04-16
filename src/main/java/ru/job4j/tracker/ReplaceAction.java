package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int itnum = input.askInt("Enter number of item to edit: ");
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(name);
        if (tracker.replace(itnum, newItem)) {
            System.out.println("Editing successful!");
        } else {
            System.out.println("Error of editing!");
        }
        return true;
    }
}
