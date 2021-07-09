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
public class StayPositive {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String stringNum;
        int num;
        final int MINIMUM = 0;
        boolean isValid = false;
        
        // Check to see if the user entered data
                
        do {

           System.out.println("Enter the number that you want to count down from: ");
           stringNum = sc.nextLine();

            if(stringNum == null || stringNum.isEmpty()) {
            System.out.println("You did not enter anything!");
            } else {
                isValid = true;
              }

        } while(!isValid);
        
        num = Integer.parseInt(stringNum);
        
        while (num >= MINIMUM) {
            
            System.out.println(num);
            num--;
        }
    }
}