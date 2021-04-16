package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int itnum = input.askInt("Enter number of item to find: ");
        Item item = new Item();
        item = tracker.findById(itnum);
        if (item == null) {
            System.out.println("Item with this number not found!");
        } else {
            System.out.println(item);
        }
        return true;
    }
}
