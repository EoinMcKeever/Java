package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("how many fizzys and buzzys you needing? ");
        String SAmount = userInput.nextLine();
        int amount = Integer.parseInt(SAmount);

        for (int i=0; i <= amount;i++){
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("fizz buzz");
            } else if (i%3 == 0){
                System.out.println("fizz");
            } else if (i%5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }

        }
        System.out.println("Tradition");

    }
}
