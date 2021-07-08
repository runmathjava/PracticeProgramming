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
public class FieldDay {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's your last name? ");
        String stringName = sc.nextLine();
        
        int strkey1 = stringName.compareTo("Baggins");
        int strkey2 = stringName.compareTo("Dresden");
        int strkey3 = stringName.compareTo("Howl");
        int strkey4 = stringName.compareTo("Potter");
        int strkey5 = stringName.compareTo("Vimes");
        
        if (strkey1 < 0) {
            
            System.out.println(stringName + " falls before Baggins.");
            System.out.println("Aha! You are on the team \"Red Dragons\"!");
            
        } else if (strkey1 > 0 && strkey2 < 0) {
            
            System.out.println(stringName + " falls after Baggins but before Dresden.");
            System.out.println("\"Aha! You are on the team \"Dark Wizards\"!");
            
        } else if (strkey2 > 0 && strkey3 < 0) {
            
            System.out.println(stringName + " falls after Dresden but before Howl.");
            System.out.println("\"Aha! You are on the team \"Moving Castles\"!");
                        
        } else if (strkey3 > 0 && strkey4 < 0) {
            
            System.out.println(stringName + " falls after Howl but before Potter.");
            System.out.println("\"Aha! You are on the team \"Golden Snitches\"!");
            
        } else if (strkey4 > 0 && strkey5 < 0) {
            
            System.out.println(stringName + " falls after Potter but before Vimes.");
            System.out.println("\"Aha! You are on the team \"NIght Guards\"!");
            
        } else if (strkey5 > 0) {
            
            System.out.println(stringName + " falls after Vimes.");
            System.out.println("\"Aha! You are on the team \"Black Holes\"!");
        }
        
        System.out.println("Good luck in the games!");
    }
    
}
