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
public class SpaceRustlers {
    public static void main(String[] args) {
        
        String stringSpaceships, stringAliens, stringCows;
        int spaceships, aliens, cows;
        
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter the numbers of spaceships, aliens, and cows,
        // and convert the strings to integers
        System.out.println("Enter the number of spaceships: ");
        stringSpaceships = sc.nextLine();
        spaceships = Integer.parseInt(stringSpaceships);
        
        System.out.println("Enter the number of aliens: ");
        stringAliens = sc.nextLine();
        aliens = Integer.parseInt(stringAliens);
        
        System.out.println("Enter the number of cows: ");
        stringCows = sc.nextLine();
        cows = Integer.parseInt(stringCows);
        
        if (aliens > spaceships) {
            System.out.println("Vroom, vroom! Let's get going!");
        } else {
            System.out.println("There arn't enough green guys to drive these ships!");
        }
        
        if (cows == spaceships) {
            System.out.println("Wow, way to plan ahead!"
                    + " JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships) {
            System.out.println("Dangit! I don't know how we're going to fit"
                    + " all these cows in here!");
        } else {
            System.out.println("Too many ships! NOt enough cows.");
        }
        
        if (aliens > cows) {
            System.out.println("Hurrah, we've got the grub!"
                    + " Hamberger party on Alpha Centaury!");
        } else {
            System.out.println("Oh no! The herds got restless and took over! "
                    + "Looks like we're hamberger now!");
        }
    }
    
}
