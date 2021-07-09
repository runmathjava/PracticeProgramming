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
public class DoOrDoNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Should I do it? (y/n)");
        boolean doIt;
        
        if (input.next().equals("y")) {
            doIt = true; // Do it!
        } else {
            doIt = false; // Don't you dare!
        }
        boolean iDidIt = false;
     /*   
        do {
            iDidIt = true;
            break;  // if no break here and doIt is true, this loop will be infinite
        }  while (doIt);
     */
        while (doIt) {
            iDidIt = true;
            break;   // if no break here, this loop will be infinite 
        }
          
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
    
}
