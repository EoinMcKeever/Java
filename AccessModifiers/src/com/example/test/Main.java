package com.example.test;

public class Main {

    public static void main(String[] args) {
	    Account x = new Account("eoin");
	    x.deposit(1000);
	    x.withdraw(500);
	    x.withdraw(-200);
	    x.deposit(-20);
	    x.calculateBalance();

        System.out.println("Balance on account is " + x.getBalance());



    }
}
