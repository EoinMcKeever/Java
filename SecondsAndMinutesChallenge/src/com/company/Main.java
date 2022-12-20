package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        String x = getDurationString(0, 0);
        System.out.println(x);
        String y = getDurationString(0);
        System.out.println(y);


	// write your code here
    }
    public static String getDurationString(long minutes, long seconds){
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)){
            long hours = minutes / 60;
            minutes = minutes % 60;

            return (hours + "h " + minutes + "m " + seconds + "s");
        } else{
            return INVALID_VALUE_MESSAGE;
        }
    }
    public static String getDurationString(long seconds){
        if (seconds >= 0){
            long minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        } else{
            return INVALID_VALUE_MESSAGE;
        }

    }
}
