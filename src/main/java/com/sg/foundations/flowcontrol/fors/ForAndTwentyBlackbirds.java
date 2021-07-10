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
public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        
        int birdsInPie = 0, i;
        for (i = 1; i <= 24; i++) {
            // System.out.println("Blackbird #" + i + " goes into the pie!");
            System.out.println("i = " + i);
            birdsInPie++;
            System.out.println("birdsInPie = " + birdsInPie);
        }
        System.out.println("i = " + i);
        System.out.println("There are " + birdsInPie + " birds in there!");
    }
    
}
