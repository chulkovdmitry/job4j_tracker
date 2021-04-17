package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

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
            out.println("Editing successful!");
        } else {
            out.println("Error of editing!");
        }
        return true;
    }
}
