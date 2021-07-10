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
public class ForTimesFor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i, ans, whichTimes, product, correct = 0;
        String stringWhichTimes, stringAns;
        
        System.out.println("Which times table would you recite? ");
        stringWhichTimes = sc.nextLine();
        whichTimes = Integer.parseInt(stringWhichTimes);
        
        for (i = 1; i < 16; i++) {
            System.out.println("Enter your answer to the question below.");
            System.out.println(i + " x " + whichTimes + " = ");
            stringAns = sc.nextLine();
            ans = Integer.parseInt(stringAns);
            product = i * whichTimes;
            if (product == ans) {
                System.out.println("Correct");
                correct++;
            } else {
                System.out.println("Sorry no, the answer is " + product);
            }
        }
        System.out.println("You got " + correct + " correct.");
    }
    
}
