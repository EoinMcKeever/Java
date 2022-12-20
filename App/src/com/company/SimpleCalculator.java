package com.company;

public class SimpleCalculator {

    private int number1;
    private int number2;

    public SimpleCalculator(int number1, int number2) {
        this.number1 = number1;

        this.number2 = number2;
    }

    public int addition(){
        int result = number1 + number2;
        return result;
    }
    public int subtraction(){
        int result = number1 - number2;
        return result;
    }
    public int division(){
        int result = number1 / number2;
        return result;
    }
    public int multiplication(){
        int result = number1 * number2;
        return result;
    }
}
