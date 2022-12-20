package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args){
        Random rng = new Random();
        boolean room = false;
        float chanceOfCleanRoom = 0.0F;
        double randomValue = rng.nextDouble();

        do{
            System.out.println("clean your room");
            chanceOfCleanRoom += 0.1;
            if (randomValue > chanceOfCleanRoom){
                room = false;
            } else if (chanceOfCleanRoom > 0.6){
                System.out.println("kid got grounded and Xbox got nicked");
                break;
            } else{
                System.out.println("Room got cleaned");
                room = true;
            }

        } while (!room);
    }

}
