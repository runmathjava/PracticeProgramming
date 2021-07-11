/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

/**
 *
 * @author aboxi
 */
public class HiddenNuts {
    public static void main(String[] args) {
        
        int i, theSpot = 0, arrayLength = 100;
        String[] hidingSpots = new String[arrayLength];
        
        Random squirrel = new Random();
        
        // initialize the entire array to an empty string " "
        // otherwise, all the spots are null causing runtime error
        for (i = 0; i < arrayLength; i++){
            hidingSpots[i] = " ";
        }
        
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        
        System.out.println("The nut has been hidden ...");
        i = 0;
        boolean found = false;
        while (!found && i < arrayLength){
            if (hidingSpots[i].equals("Nut")){
                theSpot = i;
                found = true;
            }
            i++;
        }
        System.out.println("Found it! It's in spot#: " + i);
    }
}
