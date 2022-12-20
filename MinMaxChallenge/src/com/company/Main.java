package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1000;
        int max = -1000;

        while(true){
            System.out.println("Enter number :");
            boolean check = scanner.hasNextInt();

            if (!check){
                System.out.println("min = " + min);
                System.out.println("max = " + max);
                break;
            }
            else {
                int number = scanner.nextInt();
                if (min == 1000 && max == -1000){
                    min = number;
                    max = number;
                }
                else {
                    if (number < min){
                        min = number;
                    }
                    else if (number > max){
                        max = number;
;                    }
                    else {
                        continue;
                    }
                }


            }



        }
	// write your code here
    }
}
