package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        //System.out.println("New score is " + newScore);
        //calculateScore(75);
        //calculateScore();
        double x = calcFeetAndInchesToCentimeters(2, 6 );
        System.out.println(x);
        double y = calcFeetAndInchesToCentimeters(30);
        System.out.println(y);
	// write your code here
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unknown Player " + "scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches <= 12 && inches >= 0)){
            double centimeters = (((feet*12)*2.54d ) + (inches*2.54d));
            return centimeters;
        } else {
            return -1d;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            double centimeters = inches*2.54d;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1d;
        }

    }


}
