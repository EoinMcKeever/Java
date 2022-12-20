package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args){
        Random randoizer = new Random();

        System.out.println("random can make integers: " + randoizer.nextInt());
        System.out.println("Or a double: " + randoizer.nextDouble());
        System.out.println("Or a boolean "+ randoizer.nextBoolean());

        int num = randoizer.nextInt(100);

        System.out.println(num);
    }
}
