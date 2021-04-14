package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                for (Item item : tracker.findAll()) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                int itnum = Integer.valueOf(input.askStr("Enter number of item to edit: "));
                String name = input.askStr("Enter name: ");
                Item newItem = new Item(name);
                if (tracker.replace(itnum, newItem)) {
                    System.out.println("Editing successful!");
                } else {
                    System.out.println("Error of editing!");
                }
            } else if (select == 3) {
                int itnum = Integer.valueOf(input.askStr("Enter number of item to delete: "));
                if (tracker.delete(itnum)) {
                    System.out.println("Deleting successful!");
                } else {
                    System.out.println("Error of deleting!");
                }
            } else if (select == 4) {
                int itnum = Integer.valueOf(input.askStr("Enter number of item to find: "));
                Item item = new Item();
                item = tracker.findById(itnum);
                if (item == null) {
                    System.out.println("Item with this number not found!");
                } else {
                    System.out.println(item);
                }
            } else if (select == 5) {
                String itkey = String.valueOf(input.askStr("Enter name of item to find: "));
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
