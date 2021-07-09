/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author aboxi
 */
public class JustRepeat {
    public static void main(String[] args) {
        
        String string1 = "They like it.", string2 = "They don't like it.";
        Random rndmzr = new Random();
        int c, r1, r2, pairs, petals;
        
        petals = rndmzr.nextInt(77) + 13; // because the range is 13 - 89
        System.out.println("petals = " + petals);
        pairs = petals / 2;
        
        c = rndmzr.nextInt(100);
        System.out.println("c = " + c);
        r1 = c % 2;
        
        if (r1 == 1) {
        
            while (pairs > 0) {
                System.out.println(string1);
                System.out.println(string2);
                pairs--;
            }
        } else {
            
            while (pairs > 0) {
                System.out.println(string2);
                System.out.println(string1);
                pairs--;
            }
        }
            
        r2 = petals % 2;
        if (r2 == 1) {
            if (r1 == 1) {
            System.out.println(string1);
            System.out.println("Great!");
            } else {
                System.out.println(string2);
                System.out.println("So be it.");
            }
        } else if (r1 == 1) {
            System.out.println("So be it.");
        } else {
            System.out.println("Great!");
        }
    }
    
}
