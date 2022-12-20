package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void menu() {
        System.out.println("Please select from the options below");
        System.out.println("1 : Add customer");
        System.out.println("2 : Add transaction");
        System.out.println("3 : exit");
    }

    public void selectOption(int choice) {
        boolean live = true;
        Scanner scanner = new Scanner(System.in);
        while(live) {
            switch(choice) {

                case 1:
                    System.out.println("Enter new customers name");
                    String customerName = scanner.next();
                    System.out.println("Please enter initial transaction amount");
                    double initialTransaction = scanner.nextDouble();
                    addCustomer(customerName,initialTransaction);
                    live = false;

                    break;

                case 2:
                    System.out.println("Enter customers name");
                    String transactionName = scanner.next();
                    System.out.println("Please enter initial transaction amount");
                    double transactionAmount = scanner.nextDouble();
                    addTransaction(transactionName,transactionAmount);
                    live = false;
                    break;


                case 3:
                    live = false;
            }
        }
    }

    private boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            System.out.println("added transaction");
            return true;
        }
        System.out.println("Not a registered, please try again");
        return false;
    }

    private boolean addCustomer(String customerName, double initialTransaction ) {
        if (initialTransaction > 0 && findCustomer(customerName) == null) {
            this.customerList.add(new Customer(customerName, initialTransaction));
            System.out.println("Added " + customerName + " to " + branchName + "'s customer list" );
            return true;
        } else {
            System.out.println("Failed to add customer, initial transaction must be greater then 0");
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.customerList.size(); i++) {
            if(this.customerList.get(i).getCustomerName().equals(customerName)) {
                return this.customerList.get(i);
            }
        }
        return null;
    }

}
