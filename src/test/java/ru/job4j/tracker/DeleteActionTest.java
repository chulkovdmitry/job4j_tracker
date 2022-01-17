package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DeleteActionTest {

    @Test
    public void whenDelete() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("DeleteItemMock"));
        DeleteAction deleteAction = new DeleteAction(out);
        Input input = mock(Input.class);
        when(input.askInt(any(String.class))).thenReturn(1);
        deleteAction.execute(input, tracker);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("Deleting successful!" + ln));
        assertThat(tracker.findAll().size(), is(0));
    }
}