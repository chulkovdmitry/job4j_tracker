package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreateActionTest {

    @Test
    public void whenCreate() {
        Output output = new ConsoleOutput();
        Store store = new MemTracker();
        Item item = new Item("Second");
        CreateAction createAction = new CreateAction(output);
        store.add(new Item("firstItem"));
        Input input = mock(Input.class);
        when(input.askInt(any(String.class))).thenReturn(1);
        createAction.execute(input, store);
        assertThat(output.toString(), is(output.toString()));
        assertThat(store.add(item), is(item));
    }
}