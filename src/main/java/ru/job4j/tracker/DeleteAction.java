package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int itnum = input.askInt("Enter number of item to delete: ");
        if (tracker.delete(itnum)) {
            System.out.println("Deleting successful!");
        } else {
            System.out.println("Error of deleting!");
        }
        return true;
    }
}
