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
public class KnockKnock {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Knowck Knock! Guess who!! ");
        String nameGuess = sc.nextLine();
        
        System.out.println("Name you've just guessed is " + nameGuess);
        System.out.println("");
        
        if (nameGuess.equals("Marty McFly")) { // if .equals replaced with ==, complile error
                
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("... from the future.");
            
        } else {
            System.out.println("Dude, do I -look -like " + nameGuess + "?");
        }
    }
    
}
