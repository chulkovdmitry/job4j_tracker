package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListToMapTest {
    @Test
    public void testConverter() {
        Student st1 = new Student(50, "Ivanov");
        Student st2 = new Student(90, "Sidorov");
        Student st3 = new Student(80, "Petrov");
        Student st4 = new Student(90, "Petrov");
        List<Student> st = new ArrayList<>();
        st.add(st1);
        st.add(st2);
        st.add(st3);
        st.add(st4);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivanov", st1);
        expected.put("Sidorov", st2);
        expected.put("Petrov", st3);
        Map<String, Student> actual = new ListToMap().converter(st);
        assertThat(actual, is(expected));
    }
}