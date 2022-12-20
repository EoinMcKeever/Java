package com.sg.foundations.assignment;

public class SummativeSums {
// This code sums all values in a given array
    public static void main(String[] args){
        int[] numbers = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        System.out.println("#1 Array Sum: " + sum(numbers));
        int[] numbers1 = {999, -60, -77, 14, 160, 301};
        System.out.println("#2 Array Sum: " + sum(numbers1));
        int[] numbers2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99};
        System.out.println("#3 Array Sum: " +sum(numbers2));

    }
    public static int sum(int[] numbers){
        int summed = 0;
        for (int i=0;i< numbers.length;i++){
            summed += numbers[i];
        }
        return summed;
    }
}
