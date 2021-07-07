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
 * Program description: This program calculates
 * the user's target heart rate zone, along with the max heart rate.
 * The target heart rate zone is 50 to 85 % of the maxRate,
 * which should be 220 - the user's age.
 * 
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        // Variable declaration
        int age;
        String stringAge;
        
        float maxRate, minTarget, maxTarget;
        
        final float MIN_RATE_ZONE = 0.5f, MAX_RATE_ZONE = 0.85f;
        final int DEFAULT_MAX = 220;
        
        Scanner sc = new Scanner(System.in);
        
        // get the user's age in a string, and convert the string to integer
        System.out.println("Pls enter your age: ");
        stringAge = sc.nextLine();
        age = Integer.parseInt(stringAge);
        
        // calculate the safe max heart rate
        maxRate = DEFAULT_MAX - age;
        
        // calculate the min and max heart rate targets
        minTarget = MIN_RATE_ZONE * maxRate;
        maxTarget = MAX_RATE_ZONE * maxRate;
        
        // display the max heart rate and the target heart rate zone
        System.out.println("Your maximum heart rate should be " 
                            + maxRate + " per minute");
        System.out.println("Your target heart rate zone is  " + minTarget
                            + " - " + maxTarget + " beats per minute.");
        }
    
}
