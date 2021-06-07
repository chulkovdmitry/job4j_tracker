package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenCollectTwoArrays() {
        Integer[][] array = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        Matrix matrix = new Matrix();
        List<Integer> actual = matrix.sort(array);
        assertThat(actual, is(expected));
    }

    @Test
    public void whenCollectThreeArrays() {
        Integer[][] array = {{1, 2}, {3, 4}, {5}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        Matrix matrix = new Matrix();
        List<Integer> actual = matrix.sort(array);
        assertThat(actual, is(expected));
    }
}