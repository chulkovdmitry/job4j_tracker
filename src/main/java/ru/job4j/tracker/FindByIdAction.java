package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        int itnum = input.askInt("Enter number of item to find: ");
        Item item = tracker.findById(itnum);
        if (item == null) {
            out.println("Item with this number not found!");
        } else {
            out.println(item);
        }
        return true;
    }
}
