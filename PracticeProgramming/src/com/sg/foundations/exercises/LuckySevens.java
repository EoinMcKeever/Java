package com.sg.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("How much money do you have to play with? Amounts must not be fractional: ");
        String stringMoney = userInput.nextLine();
        int money = Integer.parseInt(stringMoney);

        int highestAmount = money;
        int roundCount = 0;
        int highestAmountRollCount = 0;
        while(money > 0){
            Random randomizer = new Random();
            int dice1 = randomizer.nextInt(6);
            int dice2 = randomizer.nextInt(6);
            if ((dice1+dice2) == 7 ){
                money += 4;
                if (highestAmount < money){
                    highestAmount = money;
                    highestAmountRollCount = roundCount + 1;
                }
            }
            else{
                money -= 1;
            }
            roundCount += 1;
        }

        System.out.println("You are broke after " + roundCount + " rolls." );
        System.out.println("You should have quit after " + highestAmountRollCount + " rolls when you had " + highestAmount + "$");
    }
}
