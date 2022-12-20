package com.sg.foundations.assignment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
// this code generates random genetic makeup for a dog given it's name
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("What is your dog name? ");
        String name = userInput.nextLine(); // takes user input
        genetics(name); // calls the genetic function
    }
    public static void genetics(String name) {

        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n");
        System.out.println(name + " is:");
        Random randomizer = new Random();
        int[] gen = new int[5];
        int remain = 99; // sets remain to 99, this will be used as the bound for the randomInt. It will be updated based on what random numbers are chosen
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"}; // a list of 5 breeds

        for (int i = 0; i < 4; i++) {

            int num = randomizer.nextInt(remain);
            num = num + 1; // add 1 because the next Int is 0 inclusive and "remain" exclusive
            num = num /2; // I divide number by 2 to avoid initial random number taking up too much of the percentage. Deals with an error when remain goes to 0
            gen[i] = num ;
            remain = remain - num; // remain is updated and re fed to next int
            System.out.println(num + "% " + breeds[i]);
        }

        // these final lines use the last of the remain to assign the final percentage
        gen[4] = remain + 1;
        System.out.println(gen[4] + "% " + breeds[4]);
        System.out.println("Wow, that's quite the dog!");

        int percentage1 = randomizer.nextInt(99);
        System.out.println(percentage1);
        int percentage2 = randomizer.nextInt(99);
        int percentage3 = randomizer.nextInt(99);
        int percentage4 = randomizer.nextInt(99);
        int percentage5 = randomizer.nextInt(99);
        double doublePercentage = percentage1;
        doublePercentage1 = (doublePercentage/500)*100;
        doublePercentage = percentage2;
        System.out.println(doublePercentage1);





    }
}