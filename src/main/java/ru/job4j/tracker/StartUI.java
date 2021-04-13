package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        int select;
        int itnum;
        String itkey;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                for (Item item : tracker.findAll())
                    System.out.println(item);
            } else if (select == 2) {
                System.out.println("Enter number of item to edit: ");
                itnum = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item newItem = new Item();
                newItem.setName(name);
                if (tracker.replace(itnum, newItem)) {
                    System.out.println("Editing successful!");
                } else {
                    System.out.println("Error of editing!");
                }
            } else if (select == 3) {
                System.out.println("Enter number of item to delete: ");
                itnum = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(itnum)) {
                    System.out.println("Deleting successful!");
                } else {
                    System.out.println("Error of deleting!");
                }
            } else if (select == 4) {
                System.out.println("Enter number of item to find: ");
                itnum = Integer.valueOf(scanner.nextLine());
                Item item = new Item();
                item = tracker.findById(itnum);
                if (item == null) {
                    System.out.println("Item with this number not found!");
                } else {
                    System.out.println(item);
                }
            } else if (select == 5) {
                System.out.println("Enter name of item to find: ");
                itkey = String.valueOf(scanner.nextLine());
                Item[] array = new Item[100];
                array = tracker.findByName(itkey);
                if (array.length == 0) {
                    System.out.println("Items with this name not found!");
                } else {
                    System.out.println("Items with this name FOUND!");
                    for (Item item : array)
                        System.out.println(item);
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
