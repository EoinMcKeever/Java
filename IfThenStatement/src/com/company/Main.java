package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            //System.out.println("it is not an alien!");
        }

        int topScore = 99;
        if (topScore >= 100){
            System.out.println("you got the high score");
        }

        int secondTopScore = 90;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
        System.out.println("This is true");
    }

        boolean isCar = true;
        if (isCar == true){
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true: false;
        System.out.println(isEighteenOrOver);



    }
}
