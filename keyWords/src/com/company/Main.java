package com.company;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {
        boolean gameOver = true ;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        //System.out.println(highScore);

        int rank = calculateHighScorePosition(1500);
        displayHighScorePosition("Happy Harry", rank);
        rank = calculateHighScorePosition(900);
        displayHighScorePosition("Jealous Jack", rank);
        rank = calculateHighScorePosition(400);
        displayHighScorePosition("Mean Maria", rank);
        rank = calculateHighScorePosition(50);
        displayHighScorePosition("Nutty Noel", rank);
        }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            //System.out.println("your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }


    public static void displayHighScorePosition(String name, int rank){
        System.out.println(name + " managed to get into position " + rank + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
            if (score >= 1000) {
                return 1;
            } else if (score >= 500){
                return 2;
            } else if (score >= 100){
                return 3;
            } else {
                return 4;
            }


    }
    }

