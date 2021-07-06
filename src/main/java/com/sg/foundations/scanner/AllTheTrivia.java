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
public class AllTheTrivia {
    public static void main(String[] args) {
        
        String unit, planet1, planet2, element;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What unit is equivalent to 12 inches? ");
        planet1 = sc.nextLine();
        
        System.out.println("Which planet is the only rotating clockwise"
                            + " in the solar system? ");
        element = sc.nextLine();
        
                System.out.println("The largest volcano ever discovered"
                        + " in the solar system is located on which planet? ");
        unit = sc.nextLine();
        
        System.out.println("What is the most abundant element"
                            + " in the earth's atmosphere? ");
        planet2 = sc.nextLine();
        
        System.out.println(" ");
        System.out.println("Wow, 12 inches is " + unit);
        System.out.println("I did'n't know that the largest ever volcano"
                            + " was discovered on " + planet1);
        System.out.println("That's amazing that " + element + " is the most"
                            + " abundant element in the atmosphere...");
        System.out.println(planet2 + " is the only planet rotating clockwise,"
                            + " fantastic!");
    }
    
}
