package com.sg.foundations.assignment;

import java.util.Scanner;

public class HealthyHearts {
// This code generate a individuals maximum heart rate along with a target range for their heartbeat given the persons age
    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input your age:");
        String stringAge = userInput.nextLine();
        int age = Integer.parseInt(stringAge);

        int maximumHeartRate = 220 - age;
        int minTargetRate = (int) Math.round(maximumHeartRate * 0.5);
        int maxTargetRate = (int) Math.round(maximumHeartRate * 0.85);

        System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + minTargetRate + " - " + maxTargetRate + " beats per minute");
    }
}
