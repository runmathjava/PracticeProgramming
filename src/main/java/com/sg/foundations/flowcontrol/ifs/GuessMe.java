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
public class GuessMe {
    public static void main(String[] args) {
        
        String numChosen; int num; final int MY_CHOICE = 13;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");
        numChosen = sc.nextLine();
        num = Integer.parseInt(numChosen);
        
        if (num == MY_CHOICE) {
            System.out.println("Wow, nice guess! That was it!");
        }
        if (num < MY_CHOICE) {
            System.out.println("? Ha, nice try - too low I chose " + MY_CHOICE);
        }
        if (num > MY_CHOICE) {
            System.out.println("Too bad, way too high. I chose " + MY_CHOICE);
        }
    }
    
}
