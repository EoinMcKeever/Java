package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "a interpreted , object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "a algorithmic language");
        System.out.println(languages.put("Basic", "Beginners All Purposes Symbolic Instruction Code"));
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about java");
            System.out.println("Java added successfully");
        }
        System.out.println(languages.get("Java"));

        //languages.remove("Lisp");
        if(languages.remove("Algol", "a algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp not removed, key/value pair not found");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));
        for(String key : languages.keySet()) {
            System.out.println(languages.get(key));
        }





    }
}
