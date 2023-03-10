package com.company;

import com.company.BankAccount;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before the test methods");
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("timmy", "jimmy", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }
    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00,true);
        assertEquals(1200,balance,0);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance =  account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
       }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        double balance = account.withdraw(600.00, false);
        assertEquals(400.00,balance,0);
    }


    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00,true);
        assertEquals(1200,account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        double balance = account.withdraw(200.00,true);
        assertEquals(800 ,account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is not a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes at the end ");
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("Count = " + count++);
    }
}