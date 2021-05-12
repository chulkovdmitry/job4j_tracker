package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    //private int size = 0;
    private int ids = 1;
    //private int size = items.size();

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            //    System.arraycopy(items, index + 1, items, index, size - index - 1);
            //    items[size - 1] = null;
            //    size--;
            items.remove(index);
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            //    item.setId(id);
            //    items[index] = item;
            items.set(index, item);
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        //for (int index = 0; index < size; index++) {
        //    if (items[index].getId() == id) {
        //        rsl = index;
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
        // items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
        //return index != -1 ? items[index] : null;
    }
}