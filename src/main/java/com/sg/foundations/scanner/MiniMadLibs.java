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
public class MiniMadLibs {
    public static void main(String[] args) {
        
        // variable declation
        String string1, string2, string3, string4, string5, string6, string7,
                string8, string9, string10;
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        System.out.println(" ");
        
        System.out.println("I need a noun: ");
        string1 = sc.nextLine();
        
        System.out.println("Now an adjective: ");
        string2 = sc.nextLine();
        
        System.out.println("Another noun: ");
        string3 = sc.nextLine();
        
        System.out.println("And a number: ");
        string4 = sc.nextLine();
        num = Integer.parseInt(string4);
        
        System.out.println("Another adjective: ");
        string5 = sc.nextLine();
        
        System.out.println("A plural noun: ");
        string6 = sc.nextLine();
        
        System.out.println("Another one: ");
        string7 = sc.nextLine();
        
        System.out.println("One more: ");
        string8 = sc.nextLine();
        
        System.out.println("A verb (infinitive form): ");
        string9 = sc.nextLine();
        
        System.out.println("Same verb (past participle): ");
        string10 = sc.nextLine();
        System.out.println(" ");
        
        System.out.println("*** NOW LETS GET MAD (Libs) ***");
        System.out.println(string1 + ": the " + string2
                + " frontier. These are the voyages of the starship " + string3
                + ". Its " + num + "-year");
        System.out.println("mission: to explore strange " + string5 + " "
                + string6 + ", to seek out " + string5 + " " + string7
                + " and " + string5 + " " + string8 + ", to boldly ");
        System.out.println(string9 + " where no one has " + string10 + " before.");
    }
    
}
