/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class TheCount {
    public static void main(String[] args) {
        
        int start, stop, countBy, entry;
        String stringStart, stringStop, stringCountBy;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I love to count! Let me share my counting with you!");
        System.out.println("What number do you wnan to start with? ");
        stringStart = sc.nextLine();
        start = Integer.parseInt(stringStart);
        System.out.println("What number do you want to stop at? ");
        stringStop = sc.nextLine();
        stop = Integer.parseInt(stringStop);
        System.out.println("What nuumber do you want to count by? ");
        stringCountBy = sc.nextLine();
        countBy = Integer.parseInt(stringCountBy);
        System.out.println("");
        System.out.println("So, you want the counting goes the way below.");
        System.out.println("Start at: " + start);
        System.out.println("Stop at: " + stop);
        System.out.println("Count by: " + countBy);
        System.out.println("Here we go!");
        entry = 0;
        for (int i = start; i <= stop; i = i + countBy) {
            System.out.print(i + " ");
            entry++;
            if (entry == 3) {
                System.out.println(" - Ah ah ah!");
                entry = 0;
            }
        }
        
    }
    
}
