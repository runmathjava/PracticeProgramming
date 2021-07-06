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
public class DoItBetter {
    public static void main(String[] args) {
        
        String stringMiles, stringHotDogs, stringLanguages;
        int miles, hotDogs, languages, more;
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("How many miles can you run? ");
        stringMiles = sc.nextLine();
        miles = Integer.parseInt(stringMiles);
        more = miles + 1;
        System.out.println("I can run " + more + " miles.");
        System.out.println(" ");
        
        System.out.println("How many hot dogs can you eat? ");
        stringHotDogs = sc.nextLine();
        hotDogs = Integer.parseInt(stringHotDogs);
        more = hotDogs + 1;
        System.out.println("I can eat " + more + " hot dogs.");
        System.out.println(" ");
        
        System.out.println("How many languages can you speak? ");
        stringLanguages = sc.nextLine();
        languages = Integer.parseInt(stringLanguages);
        more = languages + 1;
        System.out.println("I can speak " + more + " languages.");
               
    }
    
}
