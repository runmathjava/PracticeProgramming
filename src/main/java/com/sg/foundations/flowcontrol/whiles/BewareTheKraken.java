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
public class BewareTheKraken {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String stringIfStop;
        boolean stopNow = false;
        
        System.out.println("Already, get those flippers and"
                + " wetsuit on - we're going diving!");
        System.out.println("Here we go!");
        int depth = 0;
        
        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        
        while (!stopNow) {
            System.out.println("So far, we've decended " + depth + "feet.");
            System.out.println("If you like to stop now, pls enter stop."
                                + " Otherwise, hit any key.");
            
            stringIfStop = sc.nextLine();
            if ("stop".equals(stringIfStop)) {
                stopNow = true;
                System.out.println("Let's stop now. Time to go!");
            } else {
                 depth += 1000;
                 if (depth >= 36200) {
                     stopNow = true;
                 }
              }
                        
            if (depth >= 20000) {
                System.out.println("Uhhh, I think I see a Kreaken, guys ...");
                System.out.println("TIME TO GO!");
                stopNow = true;
            }
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depth + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
