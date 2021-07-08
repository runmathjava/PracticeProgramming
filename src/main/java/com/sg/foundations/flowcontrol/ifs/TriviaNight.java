/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class TriviaNight {
    public static void main(String[] args) {
        
        String stringAns; int ans, correctAns = 0, numOfQst = 3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println(" ");
        
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the lowest level programming language?");
        System.out.println("1) Source Code      2) Assembly Language");
        System.out.println("3) C#               4) Machine Code");
        
        numOfQst = numOfQst - 1;
        
        System.out.println("Your answer: ");
        stringAns = sc.nextLine();
        ans = Integer.parseInt(stringAns);
        
        if (ans == 4) {
            
            System.out.println("You got it!");
            correctAns = correctAns + 1;
                        
        } else {
            
            System.out.println("Woops, you missed one. The correct answer is 4.");
        }
        
        System.out.println("Your current score = " + correctAns);
        System.out.println("You have " + numOfQst + " question(s) left.");
        System.out.println("");
        
        System.out.println("SECOND QUESTION!");
        System.out.println("Website Sequrity CAPTCHA Forms are descended from the work of?");
        System.out.println("1) Grace Hopper     2) Alan Turing");
        System.out.println("3) Charles Babbage  4) Larry Page");
        
        numOfQst = numOfQst - 1;
        
        System.out.println("Your answer: ");
        stringAns = sc.nextLine();
        ans = Integer.parseInt(stringAns);
        
        if (ans == 2) {
            
            System.out.println("You got it!");
            correctAns = correctAns + 1;
                        
        } else {
            
            System.out.println("Woops, you missed one. The correct answer is 2.");
        }
        
        System.out.println("Your current score = " + correctAns);
        System.out.println("You have " + numOfQst + " question(s) left.");
        System.out.println(" ");
        
        System.out.println("THIRD QUESTION!");
        System.out.println("Which of these Sci-Fi Ships was once slated for"
                            + " a full-size replica in Las Vegas?");
        System.out.println("1) Serenity             2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise   4) The Millennium Falcon");
        
        numOfQst = numOfQst - 1;
        
        System.out.println("Your answer: ");
        stringAns = sc.nextLine();
        ans = Integer.parseInt(stringAns);
        
        if (ans == 3) {
            
            System.out.println("You got it!");
            correctAns = correctAns + 1;
                        
        } else {
            
            System.out.println("Woops, you missed one. The correct answer is 3.");
        }
        
        System.out.println("Your current score = " + correctAns);
        System.out.println("You have " + numOfQst + " question(s) left.");
        
        if (correctAns > 0) {
            
            System.out.println("Nice job - you got " + correctAns + " correct!");
        }
        
    }
    
}
