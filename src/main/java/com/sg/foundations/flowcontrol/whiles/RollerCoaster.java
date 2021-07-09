/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class RollerCoaster {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("We're gonna go on a roller coaster...");
        System.out.println("Let me know when you want to get off...");
        
        String keepRiding = "y";
        int loopsLooped = 1, repeated = 0;
        final int MAXREP = 20;
        
        while (keepRiding.equals("y")) {
            
            while (repeated < MAXREP) {  // loopsLpped repeats itself 20 times
                                         // so, make a train of 20 same numbers
                System.out.print(loopsLooped);  
                repeated++;
            }
            System.out.println("");
            repeated = 0;
            
            System.out.println("Wanna keep goin?  (y/n): ");
          //  System.out.println(""); // without this line,
                                    // the above string "Wanna keep..." doesn't
                                    // get printed. Why not, though?
            keepRiding = sc.nextLine();
            loopsLooped++;
        }
        loopsLooped--; // actual number of looping = loopsLooped - 1
        System.out.println("Wow, that was fun!");
        System.out.println("We looped that loop " + loopsLooped + " times!");
    }
    
}
