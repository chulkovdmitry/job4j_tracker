package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindByNameActionTest {

    @Test
    public void whenFindByName() {
        Output out = new ConsoleOutput();
        Store mem = new MemTracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        mem.add(first);
        mem.add(second);
        FindByNameAction fndByName = new FindByNameAction(out);
        Input input = mock(Input.class);
        when(input.askStr(any(String.class))).thenReturn(first.getName());
        fndByName.execute(input, mem);
        assertThat(out.toString(), is(out.toString()));
        assertThat(mem.findByName("First").get(0), is(first));
    }
}