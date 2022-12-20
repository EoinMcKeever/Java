package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Branch> branchList ;

    public Bank() {
        this.branchList = new ArrayList<Branch>();
    }

    public void addBranch(String branchName) {
        if(!findBranch(branchName)) {
            branchList.add(new Branch(branchName));
            System.out.println("Added " + branchName + " to branch list");
        } else {
            System.out.println("Cannot add, branch already present");
        }


    }

    public boolean findBranch(String branchName) {
        for(Branch branch : this.branchList) {
            if ((branch.getBranchName().equals(branchName))) {
                return true;
            }

        }
        return false;
    }

    public void selectBranch() {
        boolean live = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("type exit to return to previous menu");
            printAllBranchs();
            System.out.println("Please select your branch by typing in one of the names displayed above");
            String branchName = scanner.next();
            for (Branch branch: this.branchList) {
                if (findBranch(branchName)) {
                    System.out.println("Selected " + branchName);
                    branch.menu();
                    int choice = scanner.nextInt();
                    branch.selectOption(choice);
                    live = false;
                } else if (branchName.equals("exit")) {
                    live = false;
                } else {
                    System.out.println("Invalid selection. Try again");
                }
            }
        } while(live);

    }

    public void printAllBranchs() {
        for (Branch branch: branchList) {
            int position = branchList.indexOf(branch);
            System.out.println((position+1) + ": " + branch.getBranchName());
        }
    }

    public void menu() {
        System.out.println("Please select an action");
        System.out.println("1 : Add a branch");
        System.out.println("2 : Select a branch");
        System.out.println("3 : print all branch's ");
        System.out.println("4 : exit");


    }
}
