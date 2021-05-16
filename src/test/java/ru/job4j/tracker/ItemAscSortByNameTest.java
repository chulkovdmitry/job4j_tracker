package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemAscSortByNameTest {

    @Test
    public void whenAscendingSortByIdName() {
        Item first = new Item("A");
        Item second = new Item("B");
        Item third = new Item("C");
        Item fourth = new Item("D");
        List<Item> items = Arrays.asList(
                third,
                second,
                fourth,
                first
        );
        List<Item> expected = Arrays.asList(
                first,
                second,
                third,
                fourth
        );
        Collections.sort(items, new ItemAscSortByName());
        assertThat(items, is(expected));
    }
}