package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballTeam>> superCup = new League("SuperCup");
        Team<FootballTeam> drogheda = new Team("Drogheda");
        Team<BasketballTeam> bullets = new Team("bullets");
        Team<FootballTeam> cilles = new Team("Cilles", 50);
        Team<FootballTeam> tones  =  new Team("Tones", 10);
        Object eoin = new Object();
        //superCup.addTeam(bullets);
        superCup.addTeam(drogheda);
        superCup.addTeam(cilles);
        superCup.addTeam(tones);

        System.out.println(superCup.numTeams());
        superCup.printTable();


    }
}
