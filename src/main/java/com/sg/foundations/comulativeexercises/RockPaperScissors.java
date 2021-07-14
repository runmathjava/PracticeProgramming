/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.comulativeexercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Seong Kim
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        int rounds = 0, ties = 0, userWins = 0, computerWins = 0,
            usersChoice, computersChoice;
        
        String stringRounds, stringUsersChoice, answer;
        boolean yes = true;
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        do{
        
            System.out.println("How many rounds would you like to play?");
            System.out.println("Maximum is 10 and the minimum is 1.");
            stringRounds = sc.nextLine();
            rounds = Integer.parseInt(stringRounds);
            
            if (rounds > 10 || rounds < 1){
                System.out.println("Error: The number of rounds is out of range.");
                System.out.println("The number of rounds requested is: " + rounds
                                    + ", which is not in the range from 1 to 10.");
                break;
            }
        
            while (rounds > 0){
            
                rounds--;
            
                System.out.println("Pls enter your choice.");
                System.out.println("Enter 1 if choice is Rock."
                                    + " Enter 2 if choice is Paper."
                                    + " Enter 3 if choice is Scissors.");
                stringUsersChoice = sc.nextLine();
                usersChoice = Integer.parseInt(stringUsersChoice);
            
                // it's now computer's turn
                computersChoice = rd.nextInt(3) + 1;
            
                // let's see who wins
                switch (usersChoice){
                    case 1: // rock
                        if (computersChoice == 1){ // rock so, tie
                        ties++;
                        }else if (computersChoice == 2){ // paper so, computer wins
                            computerWins++;
                        }else{ // computer's is scissors so, user wins
                            userWins++;
                        }
                        break;
                    case 2: // paper
                        if (computersChoice == 1){ // rock so, user wins
                            userWins++;
                        }else if (computersChoice == 2){ // tie
                            ties++;
                        }else{ // computer's is scissors so, compuer wins
                            computerWins++;
                        }
                        break;
                    case 3: // scissors
                        if (computersChoice == 1){ // rock so, computer wins
                            computerWins++;
                        }else if (computersChoice == 2){ // paper so, user wins
                            userWins++;
                        }else{ // scissors, tie
                            ties++;
                        }
                }
            }
            System.out.println("ties :" + ties);
            System.out.println("user's win: " + userWins);
            System.out.println("computer's win: " + computerWins);
            System.out.println("So, the result is as follows. ");
            if (userWins == computerWins){
                System.out.println("Tie");
            }else if (userWins > computerWins){
                System.out.println("Congrats! You win!");
            }else{
                System.out.println("I'm afraid you lost.");
            }
            System.out.println("");
            System.out.println("Would you like to play again?");
            System.out.println("If yes, enter 1. If no, enter 0.");
            answer = sc.nextLine();
            if ("0".equals(answer)){ // user doesn't want to play again
                yes = false;         // so, say thanks and exit the loop to terminate
                System.out.println("Thanks for playing!");
            }else{ // user wants to play again so, reset the scores back to 0s
                ties = 0;
                userWins = 0;
                computerWins = 0;
            }
            
        } while (yes);
    }
}
