package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemTracker implements Store {
    private final List<Item> items;
    private int ids;

    public MemTracker() {
        items = new ArrayList<>();
        init();
    }

    @Override
    public void init() {
        ids = 1;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.set(index, item);
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (i.getName().equals(key)) {
                result.add(i);
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    @Override
    public void close() throws Exception {
    }
}