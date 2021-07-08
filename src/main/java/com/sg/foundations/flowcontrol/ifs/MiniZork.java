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
public class MiniZork {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("with a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");
        
        String action = sc.nextLine();
        
        if (action.equals("open the mailbox")) {
            
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = sc.nextLine();
            
            if (action.equals("look inside")) {
                
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = sc.nextLine();
                
                if (action.equals("run away")) {
                    
                    System.out.println("You run away screaming"
                            + " across the fileds - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                    
                } else if (action.equals("keep looking")) {
                    
                    System.out.println("Turns out, "
                            + "hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                }
                
            } else if (action.equals("stick your hand in")) {
                
                System.out.println("Turns out, putting your hand"
                        + " inside dark places isn't a good idea.");
                System.out.println("You've been eaten by paranoia.");
                        
            }
            
        } else if (action.equals("go to the house")) {
            
            System.out.println("Turns out, people were having a party there.");
            System.out.println("Depends on what party, though.");
        
        }
        
    }
    
}
