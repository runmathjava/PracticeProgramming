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
public class PickyEater {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(sc.nextLine());
        
        System.out.println("Does it have any spinach in it? (y/n) ");
        String hasSpinach = sc.nextLine();
        
        System.out.println("Is it covered in cheese? (y/n) ");
        String cheeseCovered = sc.nextLine();
        
        System.out.println("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(sc.nextLine());
        
        System.out.println("Is it coverd in chocolate? (y/n) ");
        String chocolateCovered = sc.nextLine();
        
        System.out.println("Does it have a funny name? (y/n) ");
        String funnyName = sc.nextLine();
        
        System.out.println("Is it broccoli? (y/n) ");
        String isBroccoli = sc.nextLine();
        
        // Now, decide if they are gonna eat it
        
        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            
            System.out.println("Forget it. There's no way they'll eat that.");
            
        } else if ((timesFried > 2 && timesFried < 4) && chocolateCovered.equals("y")) {
            
            System.out.println("Oh, it's like deep-fried Snickers. That'll be a hit!");
            
        } else if (timesFried == 2 && cheeseCovered.equals("y")) {
            
            System.out.println("Mmm. Yeah, they'll eat fried cheesy doodles.");
            
        } else if ((isBroccoli.equals("y") && butterPats > 6) && cheeseCovered.equals("y")) {
            
            System.out.println("As long as the green is hidden by chedder, it'll happen!");
            
        } else if (isBroccoli.equals("y")) {
            
            System.out.println("Oh, green stuff like that might as well go in the bin.");
        }
    }
    
}
