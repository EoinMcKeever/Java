package com.sg.foundations.assignment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
// This code executes a game of rock, paper and scissors
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        boolean play = true; // This is the play again trigger. While it's true the game will keep looping.

        while (play) {
            int userWin = 0; // These variable are used to keep track of the score.
            int computerWin = 0;
            int tie = 0;
            System.out.println("How many rounds do you want to play? Must be between 1-10");
            String stringRounds = userInput.nextLine(); // User inputs how many rounds they want to play
            int rounds = Integer.parseInt(stringRounds);

            if (rounds < 1 || rounds > 10) {
                System.out.println("Rounds must be between 1-10. Cannot compute!! ERRROOORR, ERRRRROOOOR. SYSTEM OVERLOAD... KABOOOOM");
                System.exit(1); // Game ends if an invalid number for round is inputted
            } else {
                String[] choices = {"Rock", "Paper", "Scissors"};
                // The below loop, loops over the game based on the number of rounds inputted
                for (int i = 0; i < rounds; i++) {
                    boolean valid = false;

                    do { // The user input their choice of rock,paper or scissors
                        System.out.println("Player please choose: Rock = 1 - Paper = 2 - Scissors = 3 ");
                        String StringChoice = userInput.nextLine();
                        int playerChoice = Integer.parseInt(StringChoice);
                        // if a valid choice is chosen the if statement is carried out
                        if (playerChoice == 1 || playerChoice == 2 || playerChoice == 3) {
                            int computerChoice = randomizer.nextInt(2);
                            valid = true;
                            // All computer choices and user choice are compared and a score is assigned after each round
                            if (computerChoice == 1 && playerChoice == 3) {
                                computerWin += 1;
                                System.out.println("User Wins");

                            } else if (computerChoice == 2 && playerChoice == 3) {
                                userWin += 1;
                                System.out.println("User Wins");

                            } else if (computerChoice == 1 && playerChoice == 2) {
                                userWin += 1;
                                System.out.println("User Wins");

                            } else if (computerChoice == 3 && playerChoice == 2) {
                                computerWin += 1;
                                System.out.println("Computer Wins");

                            } else if (computerChoice == 2 && playerChoice == 1) {
                                computerWin += 1;
                                System.out.println("Computer Wins");

                            } else if (computerChoice == 3 && playerChoice == 1) {
                                userWin += 1;
                                System.out.println("User Wins");

                            } else {
                                tie += 1;
                                System.out.println("Tie");
                            }
                        } else { // If an invalid choice occurs. An error message is thrown and the loop is run again
                            System.out.println("Invalid choice, try again");
                        }
                    } while (!valid);
                }

                System.out.println("Ties: " + tie);
                System.out.println("User Wins: " + userWin);
                System.out.println("Computer Wins: " + computerWin);
                // Compares the total wins and decides a winner
                if (userWin > computerWin) {
                    System.out.println("User Wins");

                } else if (userWin < computerWin) {
                    System.out.println("Computer Wins");

                } else {
                    System.out.println("It is a tie");
                }
                // asks the user if they want to play again and if they do the loop is repeated. If they don't play is set to false and the loop ends
                System.out.println("Do you want to play again?");
                System.out.println("Yes = 1 - No = 0");
                String stringPlayAgain = userInput.nextLine();
                int PlayAgain = Integer.parseInt(stringPlayAgain);

                if (PlayAgain == 1){
                    continue;

                }else if (PlayAgain == 0){
                    System.out.println("Thanks for playing");
                    play = false;

                }else{
                    System.out.println("Invalid input. Game will be played again");
                }
            }
        }
    }
}
