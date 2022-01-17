package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindByIdActionTest {

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Store memTracker = new MemTracker();
        Item first = new Item("newItemOne");
        Item second = new Item("newItemTwo");
        memTracker.add(first);
        memTracker.add(second);
        FindByIdAction fndById = new FindByIdAction(out);
        Input input = mock(Input.class);
        when(input.askInt(any(String.class))).thenReturn(2);
        fndById.execute(input, memTracker);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(second + ln));
        assertThat(memTracker.findById(2).getName(), is("newItemTwo"));
    }

}