package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int i=1;i<11;i++){
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt){
                System.out.println("Invalid number");
                scanner.nextLine();
            }
            else {
                count++;
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
            }
        }
        System.out.println(sum);
        System.out.println(count);

        scanner.close();
	// write your code here
    }
}
