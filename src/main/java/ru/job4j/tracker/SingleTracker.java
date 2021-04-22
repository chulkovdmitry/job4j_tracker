package ru.job4j.tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();
    private static final SingleTracker instance = null;

    public static void main(String[] args) {
        Log4File log = Log4File.getInstance();
        log.add("add new Item");
        log.save();
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