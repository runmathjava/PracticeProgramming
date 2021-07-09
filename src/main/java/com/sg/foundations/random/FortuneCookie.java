/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.random;

import java.util.Random;

/**
 *
 * @author aboxi
 */
public class FortuneCookie {
    public static void main(String[] args) {
        
        Random rndmzr = new Random();
        
        int x = rndmzr.nextInt(10) - 5; // x is an integer from -5 to 4
        
        System.out.println("The number chosen was: " + x);
        System.out.print("Your geek fortune: ");
        switch (x) {
            case -5:
                System.out.println("easy come easy go");
                break;
            case -4:
                System.out.println("Never say never again.");
                break;
            case -3:
                System.out.println("Ignorance is not an excuse.");
                break;
            case -2:
                System.out.println("Diamon cuts diamond.");
                break;
            case -1:
                System.out.println("Sometims, losing is winning.");
                break;
            case 0:
                System.out.println("Never know until we try");
                break;
            case 1:
                System.out.println("Easier said than done");
                break;
            case 2:
                System.out.println("Say none and do nothing taking a break.");
                break;
            case 3:
                System.out.println("Use it or lose it.");
                break;
            case 4:
                System.out.println("Nothing is impossible.");
                break;
        }
        
    }
    
    
}
