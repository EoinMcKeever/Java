package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {
        Random randoizer = new Random();
        Scanner userInput = new Scanner(System.in);

        int num = (int) (randoizer.nextDouble() * (100 - -100) + -100);
        System.out.println(num);
    boolean i = true;
    do{
        String stringAction = userInput.nextLine();
        int guess = Integer.parseInt(stringAction);
        if (guess == num) {
            System.out.println("congrats buddy");
            i = false;
        } else if (guess > num) {
            System.out.println("Your trash kid, try a bit lower");
        } else {
            System.out.println("Your trash kid, try a bit higher");
        }
        } while (i);
    }
    }

