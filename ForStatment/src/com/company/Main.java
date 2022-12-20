package com.company;

public class Main {

    public static void main(String[] args) {


        int count = 0;
        for (int i=10; i<50 ; i++){
            if (isPrime(i)){
                count += 1;
                System.out.println(i);
                if (count == 10){
                    break;
                }
            }
            //System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
        }

    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }
        for(int i=2; i<=(long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
}
