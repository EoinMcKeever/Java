package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count != 6){
           // System.out.println("Count value is " + count);
            count++;
        }

        for(int i=1; i<6; i++) {
            //System.out.println("count value is "+ i);
        }
        count = 6;
        do {
            //System.out.println("Count value was " + count);
            count++;

            if(count > 100){
                break;
            }
        } while(count != 6);

        int number = 4;
        count = 0;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number)){
                count++;

                if (count >= 5) {
                    System.out.println(count);
                    break;
                }
                continue;
            }
            System.out.println("Even Number " +  number );

        }





	// write your code here
    }
    public static boolean isEvenNumber(int x) {
        if (x%2==0){
            return true;
        } else {
            return false;
        }
    }
}
