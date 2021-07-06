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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        String userName, color, fruit, stringNumber;
        int number, result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.println("What's your name? ");
        userName = sc.nextLine();
        System.out.println(" ");
        System.out.println("Hi, " + userName + "!" + " I'm Seong.");
        System.out.println("What's your favorite color? ");
        color = sc.nextLine();
        System.out.println(" ");
        System.out.println("Huh, " + color + "? " + "Mine's red.");
        System.out.println(" ");
        System.out.println("I really like apples. They are my favorite fruit, too.");
        System.out.println("Whats' your favorite fruit, " + userName + "? ");
        System.out.println(" ");
        fruit = sc.nextLine();
        System.out.println("Really? " + fruit + "? That's fantastic!");
        System.out.println("Speaking of favorites, what's your favorite number");
        System.out.println("In integer, please! ");
        stringNumber = sc.nextLine();
        number = Integer.parseInt(stringNumber);
        System.out.println(" ");
        System.out.println(number + " is a cool number. Mine is 4.");
        
        result = number * 4;
        
        System.out.println("Did you know " + number + " * 4 is " + result + "?" );
        System.out.println("That's a cool number, too!");
        System.out.println(" ");
        System.out.println("Well, thanks for talking to me, " + userName + "!");
    }
    
}
