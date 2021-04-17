package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int itnum = input.askInt("Enter number of item to delete: ");
        if (tracker.delete(itnum)) {
            out.println("Deleting successful!");
        } else {
            out.println("Error of deleting!");
        }
        return true;
    }
}
