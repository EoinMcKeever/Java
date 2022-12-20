package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Capitals {

    public static void main(String[] args) {
        Map<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");

        Set<String> keys = stateCapitals.keySet();
        for (String s : keys){
            System.out.println(s);
            System.out.println(stateCapitals.get(s));
            System.out.println(s + " - " + stateCapitals.get(s));
        }



	// write your code here
    }
}
