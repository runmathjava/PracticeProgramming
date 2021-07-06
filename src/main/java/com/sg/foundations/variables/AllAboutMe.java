/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class AllAboutMe {
    public static void main(String[] args) {
        
        String name, favoriateFood, housingType, howHappy;
        String stringNumberOfPets, stringAnswerToHowToWhistle;
        int numberOfPets, answerToHowToWhistle;
        boolean howToWhistle = false;
        
        Scanner sc = new Scanner(System.in);
        
        // get the name of the user
        System.out.println("What's your name?");
        name = sc.nextLine();
        
        // get the number of pets the user has
        System.out.println("How many pets do you have?");
        stringNumberOfPets = sc.nextLine();
        
        // convert the string value to integer value
        numberOfPets = Integer.parseInt(stringNumberOfPets);
        
        // Ask the user's favoriate food
        System.out.println("What's your favoriate food?");
        favoriateFood = sc.nextLine();
        
        // Ask the hosing type the user has
        System.out.println("What kind of housing do you have?");
        System.out.println("For example, do you live in an apartment, a house, etc.?");        
        housingType = sc.nextLine();
        
        // Ask how the user likes the housing
        System.out.println("How do you like your residence?"
                + " Do you like, hate, etc. living there?");
        System.out.println("For example, if you like it, enter: like it.");
        howHappy = sc.nextLine();
        
        // Ask if the user can whistle
        System.out.println("Do you know how to whistle?");
        System.out.println("If yes, enter 1. If no, enter 0.");
        stringAnswerToHowToWhistle = sc.nextLine();
        
        // convert string value to integer value
        answerToHowToWhistle = Integer.parseInt(stringAnswerToHowToWhistle);
        
        if (answerToHowToWhistle == 1) {
            howToWhistle = true;
        }
                
        // display the info about the user
        System.out.println("Your name is " + name);
        System.out.println("You have " + numberOfPets + " pet(s).");
        System.out.println("Your favoriate food is " + favoriateFood + ".");
        System.out.println("You live in " + housingType + ".");
        System.out.println("And you " + howHappy + " there.");
        if (howToWhistle) {
            System.out.println("You know how to whistle.");
        } else {
            System.out.println("You don't know how to whistle.");
        }
    }
    
}
