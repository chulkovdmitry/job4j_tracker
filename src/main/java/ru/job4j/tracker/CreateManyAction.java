package ru.job4j.tracker;

public class CreateManyAction implements UserAction {
    private final Output out;
    private static final long KB = 1000;
    private static final long MB = KB * KB;
    private static final Runtime ENVIRONMENT = Runtime.getRuntime();

    public static void info() {
        final long freeMemory = ENVIRONMENT.freeMemory();
        final long totalMemory = ENVIRONMENT.totalMemory();
        final long maxMemory = ENVIRONMENT.maxMemory();
        System.out.println("==== Environment state ==== ");
        System.out.printf("Free: %d%n", freeMemory);
        System.out.printf("Total: %d%n", totalMemory);
        System.out.printf("Max: %d%n", maxMemory);
    }

    public CreateManyAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Create Many";
    }

    @Override
    public boolean execute(Input input, Store memtracker) {
        out.println("=== Create new Items ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        System.out.println("Size before creation");
        info();
        for (int i = 0; i < 10000; i++) {
            memtracker.add(item);
        }
        System.out.println("Size after creation");
        info();
        return true;
    }
}
