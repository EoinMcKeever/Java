package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock bufferLock = new ReentrantLock();
        BankAccount1 bankAccount1 = new BankAccount1("1",1000.00, bufferLock);


        Thread thread1 = new Thread() {
            public void run() {
                    bankAccount1.deposit(300.00);
                    bankAccount1.withdraw(50.00);
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                    bankAccount1.deposit(203.75);
                    bankAccount1.withdraw(100.00);


            }
        };

        thread1.start();
        thread2.start();


    }
}
