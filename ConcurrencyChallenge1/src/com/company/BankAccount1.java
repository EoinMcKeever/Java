package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount1 {

    private double balance;
    private String accountNumber;
    private ReentrantLock bufferLock;

    public BankAccount1(String accountNumber, double initialBalance, ReentrantLock bufferLock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.bufferLock = bufferLock;
    }

    public boolean deposit (double amount){

        boolean status = false;

            try {
                if(bufferLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        balance += amount;
                        status = true;
                    } finally {
                        bufferLock.unlock();
                    }
                } else {
                    System.out.println("Failed");
                }
            } catch (InterruptedException e) {

            }

        System.out.println("Transaction status =" + status);
        return status;
    }


    public void withdraw(double amount) {

        boolean status = false;

        try{
            if(bufferLock.tryLock(1000,TimeUnit.MILLISECONDS)) {
                try{
                    balance -= amount;
                    status = true;
                } finally {
                    bufferLock.unlock();
                }
            } else{
                System.out.println("Failed1");
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Transaction status =" + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println(accountNumber);
    }
}