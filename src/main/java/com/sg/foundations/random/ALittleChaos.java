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
public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        // no randomizer for types in char, byte, and short
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or a float: " + randomizer.nextFloat());
        System.out.println("Or a long: " + randomizer.nextLong());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(10); // random numbers from 0 to 9
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 5: ");
        
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.print(randomizer.nextInt(6) + ", ");
        System.out.println(randomizer.nextInt(6));
        
        System.out.println("Here's a bunch of numbers from 5 - 10: ");
        
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.print(randomizer.nextInt(6) + 5 + ", ");
        System.out.println(randomizer.nextInt(6) + 5);
    }
    
}
