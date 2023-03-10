package com.example.test;

import java.util.*;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        Map<String, Integer> tempExit = null;
        locations.put(0, new Location(0, "You are sitting in front of a computer learning java",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small bridge",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",5);
        locations.put(2, new Location(2, "You are on top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5, "You are in a forest",tempExit));

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");



        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
                System.out.println("Available exits are ");
                for (String exit : exits.keySet()) {
                    System.out.print(exit + ", ");
                }
                System.out.println();

                String[] directionList = scanner.nextLine().toUpperCase().split(" ");


                String direction = null;
                
                for(String word : directionList) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                    } else if(vocabulary.containsValue(word)) {
                        direction = word;
                    } else {
                        continue;
                    }

                }
                
                if(exits.containsKey(direction)) {
                    loc = exits.get(direction);
                } else {
                    System.out.println("you cannot go in that direction");
                }


        }
    }
}
