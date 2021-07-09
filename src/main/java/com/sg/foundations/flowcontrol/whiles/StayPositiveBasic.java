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
public class StayPositiveBasic {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String stringNum;
        int num;
        final int MINIMUM = 0;
               
        System.out.println("Pls enter a number that you want to count down from: ");
        stringNum = sc.nextLine();
        
        num = Integer.parseInt(stringNum);
        
        while (num >= MINIMUM) {
            
            System.out.println(num);
            num--;
        }
    }
}
