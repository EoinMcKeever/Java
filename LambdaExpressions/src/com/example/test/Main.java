package com.example.test;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();
    }
}

