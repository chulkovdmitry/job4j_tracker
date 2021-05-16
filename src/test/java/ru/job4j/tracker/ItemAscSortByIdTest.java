package ru.job4j.tracker;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ItemAscSortByIdTest {

    @Test
    public void whenAscendingSortById() {
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
                first,
                second,
                third,
                fourth
        );
        Collections.sort(items, new ItemAscSortById());
        assertThat(items, is(expected));
    }
}