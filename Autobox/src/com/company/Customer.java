package com.company;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double amount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(amount);

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void addTransaction(double amount) {
        if (amount > 0){
            this.transactions.add(amount);
            System.out.println("Transaction successful: " + amount + " deposited");
        } else {
            System.out.println("Transaction successful: " + amount + " withdrawn");
        }

    }
}
