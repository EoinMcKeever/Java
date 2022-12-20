package com.company;

import java.util.ArrayList;

import java.util.Collections;

public class League<T extends Team>{

    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (members.contains(team)) {
            System.out.println(team.getName() + " is already on this team");
            return false;
        } else {
            members.add(team);
            System.out.println(team.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public void printTable() {
        Collections.sort(members);
        for (T team : members) {
            System.out.println(team.getName());
        }

    }

    public int numTeams() {
        return this.members.size();
    }



}

