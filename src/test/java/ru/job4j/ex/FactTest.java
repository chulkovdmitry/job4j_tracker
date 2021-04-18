package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNNegativeThenException() {
        int rsl = Fact.calc(-5);
    }

    @Test
    public void when5then120() {
        int rsl = Fact.calc(5);
        assertThat(rsl, is(120));
    }
}