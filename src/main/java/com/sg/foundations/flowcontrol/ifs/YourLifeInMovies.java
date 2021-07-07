/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name, stringYear; int year;
        
        final int YEAR1 = 2005, YEAR2 = 1995, YEAR3 = 1985, YEAR4 = 1975,
                  YEAR5 = 1965, YEAR6 = 1980;
        
        System.out.println("Hey, let's play a game! What's your name? ");
        name = sc.nextLine();
        
        System.out.println("Ok, " + name + ", what's your birth year? ");
        stringYear = sc.nextLine();
        year = Integer.parseInt(stringYear);
        
        if (year < YEAR1 && year >= YEAR2) {
            System.out.println("You were born between " + YEAR1 + " and " + YEAR2);
            System.out.println("And Pixar's 'Up' came out over a decade ago.");
        }
        if (year < YEAR2 && year >= YEAR3) {
            System.out.println("You were born between " + YEAR2 + " and " + YEAR3);
            System.out.println("And the first Hary Potter came out over 15 years ago.");
        }
        if ((year < YEAR3 && year >= YEAR4) && (year != YEAR6)) {
            System.out.println("You were born between " + YEAR3 + " and " + YEAR4);
            System.out.println("And Space Jam came out last decade, but the one before THAT.");
        }
        if (year < YEAR4 && year >= YEAR5) {
            System.out.println("You were born between " + YEAR4 + " and " + YEAR5);
            System.out.println("And the original Jurassic Park release is closer"
                        + " to the first to lunar landing than it is today.");
        }
        if (year < YEAR5) {
            System.out.println("You were born before " + YEAR5);
            System.out.println("And the MASH TV series has been around for almost half a century!");
        }
        if (year == YEAR6) {
            System.out.println("Well " + name + "...");
            System.out.println("Did you know that Pixar's 'Up' came out over a decage ago?");
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
            System.out.println("Also, Space Jam came out last decade, but the one before THAT.");
        }
    }
    
}
