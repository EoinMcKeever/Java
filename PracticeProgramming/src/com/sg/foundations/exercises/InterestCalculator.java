package com.sg.foundations.exercises;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please input your annual interest rate:");
        String stringInterestRate = userInput.nextLine();
        double interestRate = Double.parseDouble(stringInterestRate);

        System.out.print("How much do you want to invest: ");
        String stringPrincipal = userInput.nextLine();
        double principal = Double.parseDouble(stringPrincipal);

        double endYearPrincipal = principal;
        double earned;
        int paid;
        double quarterlyInterestRate = 0;

        System.out.println("Please input number of years your investment will stay in the fund");
        String stringYear = userInput.nextLine();
        int year = Integer.parseInt(stringYear);

        System.out.println("Please input whether you want quarterly = 1  -- monthly = 2 -- daily = 3 -- compound periods");
        String stringCompoundPeriod = userInput.nextLine();
        int compoundPeriod = Integer.parseInt(stringCompoundPeriod);

        if (compoundPeriod == 1) {
            paid = 4;
            quarterlyInterestRate = interestRate/4;
        }else if (compoundPeriod == 2) {
            paid = 12;
            quarterlyInterestRate = interestRate/12;
        }else if (compoundPeriod == 3) {
            paid = 365;
            quarterlyInterestRate = interestRate/365;
        }else{
            System.out.println("Invalid value for compound period. Defaulting to quarterly");
            paid = 4;
            quarterlyInterestRate = interestRate/4;
        }


        System.out.println("Calculating...");

        for(int i=0;i<year;i++){
            System.out.println("Year " + (i+1) + ": ");
            System.out.println("Began with $" + principal);
            earned = principal;
            for(int j=0;j<paid;j++){
                principal  += principal * (quarterlyInterestRate/100);
            }
            earned = principal - earned;
            System.out.println("Earned $" + earned );
            System.out.println("Ended with $" + principal + "\n");
        }


    }
}
