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
 * @author aboxi
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        int rounds = 0, ties = 0, userWins = 0, computerWins = 0,
            usersChoice, computersChoice;
        String stringRounds, stringUsersChoice, answer;
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("How many rounds would you like to play?");
        System.out.println("Maximum is 10 and the minimum is 1.");
        stringRounds = sc.nextLine();
        rounds = Integer.parseInt(stringRounds);
        
        while (rounds > 0){
            
            rounds--;
            
            System.out.println("Pls enter your choice.");
            System.out.println("Enter 1 if choice is Rock. Enter 2 if choice is Paper."
                                + " Enter 3 if choice is Scissors.");
            stringUsersChoice = sc.nextLine();
            usersChoice = Integer.parseInt(stringUsersChoice);
            
            // it's now computer's turn
            computersChoice = rd.nextInt(3) + 1;
            
            // let's see who wins
            switch (usersChoice){
                case 1: // Rock
                    if (computersChoice == 1){ // Rock so, tie
                        ties++;
                    }else if (computersChoice == 2){ // Paper so, computer wins
                        computerWins++;
                    }else{ // computer's is Scissors so, user wins
                        userWins++;
                    }
                    break;
                case 2: // Paper
                    if (computersChoice == 1){ // Rock so, user wins
                        userWins++;
                    }else if (computersChoice == 2){ // tie
                        ties++;
                    }else{ // computer's is scissors so, compuer wins
                        computerWins++;
                    }
                    break;
                case 3: // Scissors
                    if (computersChoice == 1){ // Rock so, computer wins
                        computerWins++;
                    }else if (computersChoice == 2){ // paper so, user wins
                        userWins++;
                    }else{ // tie
                        ties++;
                    }
            }
        }
        
        System.out.println("ties :" + ties);
        System.out.println("user's win: " + userWins);
        System.out.println("computer's win: " + computerWins);
        if (userWins == computerWins){
            System.out.println("Tie");
        }else if (userWins > computerWins){
            System.out.println("Congrats! You win!");
        }else{
            System.out.println("I'm afraid you lost.");
        }
    }
    
}
