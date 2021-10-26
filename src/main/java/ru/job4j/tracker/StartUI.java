package ru.job4j.tracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private static Connection cn;
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        int i = 0;
        for (UserAction show : actions) {
            out.println(i++ + ". " + show.name());
        }
    }

    public void getConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/tracker";
        String login = "postgres";
        String password = "password";
        cn = DriverManager.getConnection(url, login, password);
    }

    public static void main(String[] args) {
        Input validate = new ValidateInput(new ConsoleOutput(), new ConsoleInput());
        try (Store tracker = new SqlTracker(cn)) {
            tracker.init();
            UserAction[] actions = {
                    new CreateAction(new ConsoleOutput()),
                    new FindAllAction(new ConsoleOutput()),
                    new ReplaceAction(new ConsoleOutput()),
                    new DeleteAction(new ConsoleOutput()),
                    new FindByIdAction(new ConsoleOutput()),
                    new FindByNameAction(new ConsoleOutput()),
                    new ExitAction()
            };
            new StartUI(new ConsoleOutput()).init(validate, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}