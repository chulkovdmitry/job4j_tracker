package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = true;
        status = 7;
        message = "Continue";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("You are active: " + active);
        System.out.println("Your level: " + status);
        System.out.println("Message for you: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error mistake = new Error(false, 81, "Stop");
        mistake.printInfo();
        Error vsyopropalo = new Error(false, 0, "Start again");
        vsyopropalo.printInfo();
    }
}
