package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean live = true;

        while(live){
            bank.menu();
            int choice = scanner.nextInt();
            if(choice > 0 && choice < 5) {
                switch (choice) {
                    case 1:
                        System.out.println("Please choose your branch name");
                        bank.addBranch(scanner.next());
                        break;

                    case 2:
                        bank.selectBranch();

                    case 3:
                        bank.printAllBranchs();
                        break;

                    case 4:
                        System.out.println("Exiting");
                        live = false;

                }
            } else {
                System.out.println("Invalid choice. Try again");
            }
        }

    }
}
