package ru.job4j.lambda;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class FITest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FI function = new FI();
        List<Double> result = function.diapason(5, 8, x -> (2 * x) + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadFunctionThenQuadResults() {
        FI function = new FI();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenIndicativeResults() {
        FI function = new FI();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}