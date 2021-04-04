package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayac = new Hare();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();
        zayac.tryEat(kolobok);
        kolobok.goAway();
        volk.tryEat(kolobok);
        kolobok.goAway();
        lisa.tryEat(kolobok);
        kolobok.dead();
    }
}
