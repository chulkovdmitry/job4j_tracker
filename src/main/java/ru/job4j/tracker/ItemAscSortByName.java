package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscSortByName implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}