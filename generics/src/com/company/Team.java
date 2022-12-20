package com.company;

public class Team<T extends Team> implements Comparable<Team<T>>{

    private String name;
    private int points;


    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }


    public int getPoints() {
        return points;
    }




    @Override
    public int compareTo(Team<T> team) {
        if(this.points > team.points) {
            return -1;
        }
        else if (this.points < team.points) {
            return 1;
        }
        else {return 0;}
    }
}
