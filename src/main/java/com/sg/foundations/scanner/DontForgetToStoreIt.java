/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class DontForgetToStoreIt {
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything;
        double pi;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at lease 5 decimals: ");
        pi = Double.parseDouble(inputReader.nextLine());
        
        // We've used Double.parseDouible but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt
        
        System.out.println("What is the meaning of life, the universe & everything? ");
        System.out.println("That is, how young are you?");
        System.out.println("In other words, how long have you been in the world?");
        meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());
                
        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();
                
        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.nextLine();
                
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of your life is " 
                            + (2 * pi * meaningOfLifeAndEverything));
    }
}
