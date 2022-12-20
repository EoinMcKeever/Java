package com.company;

public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("56789", 2.50, "default", "default","default"); //must be the first line
        System.out.println("hi");
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this("9999",100.55,customerName,email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNUmber(){
        return this.phoneNumber;
    }
    public void depositFunds(double deposit){
        balance = balance + deposit;
        System.out.println(balance);
    }
    public void withdrawFunds(double amount){
        if ((balance - amount) > 0){
            balance = balance - amount;
            System.out.println(balance);
        }
        else{
            System.out.println("insuffient balance");
        }
    }

}
