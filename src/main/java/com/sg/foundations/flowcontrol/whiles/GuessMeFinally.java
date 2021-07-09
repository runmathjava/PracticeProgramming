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
public class GuessMeFinally {
    public static void main(String[] args) {
        
        String numChosen; int num; final int MY_CHOICE = 13; boolean found = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");
        numChosen = sc.nextLine();
        num = Integer.parseInt(numChosen);
        
        if (num == MY_CHOICE) {
            System.out.println("Wow, nice guess! That was it!");
            found = true;
        }
        
        while (!found) {
        
            if (num == MY_CHOICE) {
                System.out.println("Finally! It's about time you got it!");
                found = true;
            
            } else if (num < MY_CHOICE) {
                        System.out.println("? Ha, nice try - too low! Try again!");
            
                    } else {
                        System.out.println("Too bad, way too high. Try again!");
                    }
            if (!found) {
                System.out.println("Your guess: ");
                numChosen = sc.nextLine();
                num = Integer.parseInt(numChosen);
            }
        }
    }
}
