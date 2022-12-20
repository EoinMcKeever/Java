package com.company;

public class Bird extends Animal implements CanFly {
    @Override
    public void eat() {
        System.out.println(getName() + "is pecking");
    }


    @Override
    public void breathe() {
        System.out.println("Load nnoiseesss");
    }

    public Bird(String name) {
        super(name);
    }


    @Override
    public void fly() {
        System.out.println(getName() + " is flapping wings");
    }
}
