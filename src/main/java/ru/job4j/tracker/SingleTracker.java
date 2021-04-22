package ru.job4j.tracker;

public class SingleTracker {

    private static int count;
    private static final SingleTracker INSTANCE = new SingleTracker();
    private Tracker tracker = new Tracker();

    private SingleTracker() {
        count++;
    }

    public static SingleTracker getInstance() {
        return INSTANCE;
    }

    public static int getAmountOfInstance() {
        return count;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }
}