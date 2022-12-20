package com.sg.foundations.userinput;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args){
        boolean b3 = false;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Let's play MAD LIBS!");
        System.out.print("I need a noun: ");
        String noun1 = inputReader.nextLine();
        System.out.print("Now an adjective: ");
        String adjective1 = inputReader.nextLine();
        System.out.print("Another noun: ");
        String noun2 = inputReader.nextLine();
        System.out.print("And a number: ");
        String number = inputReader.nextLine();
        System.out.print("Another adjective: ");
        String adjective2 = inputReader.nextLine();

        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " + number + "-year mission: to explore strange " + adjective2 + ", to seek out " + adjective2);
    }


}
