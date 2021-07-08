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
public class BirthStones {
    public static void main(String[] args) {
        
        String stringMonth; int month;
        
        Scanner sc = new Scanner(System.in);
        
        // ask the user to enter the number that matches the birth month,
        // and then, convert the string into an integer
        System.out.println("Enter the number matching your birth month: ");
        stringMonth = sc.nextLine();
        month = Integer.parseInt(stringMonth);
        
        // print out the name of the month and its corresponding birthstone
        
        // check to see if the number for the month is valid
        if (month <= 0 || month >= 13) {
            
            System.out.println("The number for your birth month is not valid.");
            
        } else if (month == 1) {
            
                System.out.println("You were born in January,"
                        + " and your birthstone is garnet.");
                
            } else if (month == 2) {
                
                System.out.println("You were born in Feburuary,"
                        + " and your birthstone is amethyst.");
                
            } else if (month == 3) {
                
                System.out.println("You were born in March,"
                        + " and your birthstone is aquamarine.");
                
            } else if (month == 4) {
                
                System.out.println("You were born in April,"
                        + " and your birthstone is diamond.");
                
            } else if (month == 5) {
                
                System.out.println("You were born in May,"
                        + " and your birthstone is emerald");
                
            } else if (month == 6) {
                
                System.out.println("Your were born in June,"
                        + " and your birthstone is pearl.");
                
            } else if (month == 7) {
                
                System.out.println("You were born in July,"
                        + " and your birthstone is ruby.");
                
            } else if (month == 8) {
                
                System.out.println("You were born in August,"
                        + " and your birthstone is peridot.");
                
            } else if (month == 9) {
                
                System.out.println("You were born in September,"
                        + " and your birthstone is sapphire.");
                
            } else if (month == 10) {
                
                System.out.println("You were born in October,"
                        + " and your birthstone is opal.");
                
            } else if (month == 11) {
                
                System.out.println("You were born in November,"
                        + " and your birthstone is topaz.");
                
            } else {
                
                System.out.println("You were born in December,"
                        + " and your birthstone is turquoise.");
        }
        
    }
    
}
