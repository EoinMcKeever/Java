package com.sg.foundations.exercises;

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        int count = 0;
        int perfect = 0;
        Boolean prime = true;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        String stringNum = userInput.nextLine();
        int num = Integer.parseInt(stringNum);
        System.out.print("The factor of " + num + " are ");
        for (int i=1; i<(num/2)+1;i++){
            if (num % i == 0 && i != num){
                if (i!=1){
                    prime = false;
                }
                System.out.print(i+" ");
                perfect += i;
                count += 1;
            } else {
                continue;
            }
        }
        System.out.println("");
        System.out.println(num + " has " + count + " factors.");
        System.out.println(perfect);
        if(perfect == num) {
            System.out.println(num + " is a perfect number.");
        }
        if (prime == true){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }


    }
}