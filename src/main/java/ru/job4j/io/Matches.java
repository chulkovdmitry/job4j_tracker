package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        int matches;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            do {
                System.out.println(player + " введите число от 1 до 3:");
                matches = Integer.parseInt(input.nextLine());
            } while (matches > 3 || matches < 1);
            turn = !turn;
            count -= matches;
            System.out.println("Спичек осталось: " + count);
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
