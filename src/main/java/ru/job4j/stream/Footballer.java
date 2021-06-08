package ru.job4j.stream;

public class Footballer {
    private String name;
    private String surname;
    private int age;
    private String position;
    private String club;


    static class Builder {
        private String name;
        private String surname;
        private int age;
        private String position;
        private String club;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(int age) {
            this.age = age;
            return this;
        }

        Builder buildPosition(String position) {
            this.position = position;
            return this;
        }

        Builder buildClub(String club) {
            this.club = club;
            return this;
        }

        Footballer build() {
            Footballer player = new Footballer();
            player.name = name;
            player.surname = surname;
            player.age = age;
            player.position = position;
            player.club = club;
            return player;
        }
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", discipline='" + position + '\'' +
                ", club='" + club + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Footballer player1 = new Builder()
                .buildName("Sergey")
                .buildSurname("Bezrukov")
                .buildAge(28)
                .buildPosition("goalkeeper")
                .buildClub("Vodokachka")
                .build();
        System.out.println(player1);

        Footballer player2 = new Builder()
                .buildName("Grisha")
                .buildSurname("Krivonogov")
                .buildAge(34)
                .buildPosition("forward")
                .buildClub("Gazmyas")
                .build();
        System.out.println(player2);
    }
}
