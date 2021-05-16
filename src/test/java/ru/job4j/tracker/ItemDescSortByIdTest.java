package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemDescSortByIdTest {

    @Test
    public void whenDescendingSortById() {
        Item first = new Item();
        Item second = new Item();
        Item third = new Item();
        Item fourth = new Item();
        first.setId(1);
        second.setId(2);
        third.setId(3);
        fourth.setId(4);
        List<Item> items = Arrays.asList(
                third,
                second,
                fourth,
                first
        );
        List<Item> expected = Arrays.asList(
                fourth,
                third,
                second,
                first
        );
        Collections.sort(items, new ItemDescSortById());
        assertThat(items, is(expected));
    }
}