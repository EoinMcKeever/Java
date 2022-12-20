package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value " + myMinFloatValue);
        System.out.println("Float minimum value " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value " + myMinDoubleValue);
        System.out.println("double maximum value " + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue = 5.25f / 2f;
        double myDoubleValue = 5.25d / 2d;

        double pounds = 180d;
        double result = pounds*0.45359237d ;
        System.out.println(result);

    }
}
