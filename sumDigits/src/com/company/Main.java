package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(3213));
	// write your code here
    }

    private static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;

        while (number >0){
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;
    }
}
