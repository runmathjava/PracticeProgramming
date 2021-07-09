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
public class Opinionator {
    public static void main(String[] args) {
        
        Random rndmzr = new Random();
        
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide for me!");
        
        int x = rndmzr.nextInt(5);
        
        System.out.println("The number chosen was: " + x);
        
        switch (x) {
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Woolly mammoths are definitely the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            case 4:
                System.out.println("Cockatoos are just so awesome!");
                break;
            case 5:
                System.out.println("Have you ever met a naked mole-rat?"
                        + "  They are great!");
                break;
        }
        
        System.out.println("Thanks Random, maybe you're the best!");
    }
    
}
