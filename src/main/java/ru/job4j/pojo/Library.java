package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book lord = new Book("The Lord of the Rings", 1120);
        Book stone = new Book("Harry Potter and the Philosopher’s Stone", 432);
        Book eyre = new Book("Jane Eyre", 512);
        Book frank = new Book("Frankenstein", 320);
        Book[] books = new Book[4];
        books[0] = lord;
        books[1] = stone;
        books[2] = eyre;
        books[3] = frank;
        Book clean = new Book("Clean code", 911);
        books[0] = clean;
        for (int index = 0; index < books.length; index++) {
            Book bi = books[index];
            System.out.println(bi.getTitle() + " - " + bi.getPages());
        }
        System.out.println("-------------------------");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bi = books[index];
            System.out.println(bi.getTitle() + " - " + bi.getPages());
        }
        System.out.println("-------------------------");
        for (int index = 0; index < books.length; index++) {
            Book bi = books[index];
            if (bi.getTitle().equals("Clean code")) {
                System.out.println(bi.getTitle() + " - " + bi.getPages());
            }
        }
    }
}
