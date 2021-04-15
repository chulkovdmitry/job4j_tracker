package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int itnum = input.askInt("Enter number of item to edit: ");
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(name);
        if (tracker.replace(itnum, newItem)) {
            System.out.println("Editing successful!");
        } else {
            System.out.println("Error of editing!");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int itnum = input.askInt("Enter number of item to delete: ");
        if (tracker.delete(itnum)) {
            System.out.println("Deleting successful!");
        } else {
            System.out.println("Error of deleting!");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        int itnum = input.askInt("Enter number of item to find: ");
        Item item = new Item();
        item = tracker.findById(itnum);
        if (item == null) {
            System.out.println("Item with this number not found!");
        } else {
            System.out.println(item);
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
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
    }

    public static void findAllItem(Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(item);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
