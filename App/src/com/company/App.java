package com.company;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int number1 = validateInput();
        int operator = 0;

        while (true) {

            try{

                System.out.println("Enter a operator: (+) = 1   (-) = 2   (/) = 3   (*) = 4");
                Scanner userInput = new Scanner(System.in);
                operator = userInput.nextInt();

                if (operator == 1 || operator == 2 || operator == 3 || operator == 4) {
                    break;

                } else {
                    System.out.println("Error. You did not enter a valid number");
                    continue;
                }

            } catch (Exception e){
                System.out.println("Error. You did not enter a number");
                continue;
            }

        }

        int number2 = validateInput();
        SimpleCalculator cal = new SimpleCalculator(number1,number2);

        if(operator == 1) System.out.println(cal.addition());
        else if (operator == 2) System.out.println(cal.subtraction());
        else if (operator == 3) System.out.println(cal.division());
        else if (operator == 4) System.out.println(cal.multiplication());
        else System.out.println("Calculation failed, please double check inputs and try again");
        System.out.println("Thank you user");
    }
        public static int validateInput() {

            while(true){

                try{

                    System.out.println("Enter number");
                    Scanner userInput = new Scanner(System.in);
                    int number = userInput.nextInt();
                    return number;
                }
                catch(Exception e){

                    System.out.println("Error. You did not enter a number");
                    continue;
                }
            }
        }





}
