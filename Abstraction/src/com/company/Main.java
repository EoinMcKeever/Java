package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog("dude");
        animal.breathe();
        animal.eat();

        Bird  bird = new Parrot("Parrot");
        bird.breathe();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
