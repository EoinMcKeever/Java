package com.company;

public class Main {

    public static void main(String[] args) {
        double x = 20.00d;
        double y = 80.00d;
        double result = (x + y) * 100.00d;
        result = result % 40.00d;
        System.out.println(result);
        boolean test = (result == 0) ? true : false;
        if (!test){
            System.out.println("Got some remainder");
        }








    }
}
