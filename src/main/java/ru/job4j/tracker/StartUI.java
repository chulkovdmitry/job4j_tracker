package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    //    public void init(Input input, Tracker tracker, UserAction[] actions) {
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            //    if (select < 0 || select >= actions.length) {
            //        out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            //    UserAction action = actions[select];
            UserAction action = actions.set(select, actions.get(select));
            run = action.execute(input, tracker);
        }
    }

    //private void showMenu(UserAction[] actions) {
    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        //for (int index = 0; index < actions.length; index++) {
        //    out.println(index + ". " + actions[index].name());
        for (int i = 0; i < actions.size(); i++) {
            out.println(i + ". " + actions.get(i).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        //UserAction[] actions = {
        //        new CreateAction(output), new FindAllAction(output), new ReplaceAction(output),
        //        new DeleteAction(output), new FindByIdAction(output), new FindByNameAction(output), new ExitAction()
        //};
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new FindAllAction(output));
        actions.add(new ReplaceAction(output));
        actions.add(new DeleteAction(output));
        actions.add(new FindByNameAction(output));
        actions.add(new FindByIdAction(output));
        actions.add(new ExitAction());
        new StartUI(output).init(input, tracker, actions);
    }
}