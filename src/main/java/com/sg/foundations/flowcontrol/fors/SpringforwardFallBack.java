/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author aboxi
 */
public class SpringforwardFallBack {
    public static void main(String[] args) {
        int i;
        System.out.println("It's Spring...!");
        for (i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        
        System.out.println("\nOh no, it's fall...");
        for (i = 9; i > -1; i--) {
            System.out.print(i + ", ");
        }
    }
    
}
