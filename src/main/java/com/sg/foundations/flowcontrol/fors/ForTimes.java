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
public class ForTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, ans; String stringAns;
        System.out.println("Which times table shall I recite? ");
        stringAns = sc.nextLine();
        ans = Integer.parseInt(stringAns);
        for (i = 1; i < 16; i++) {
            System.out.println(i + " x " + ans + " = " + i * ans);
        }
    }
    
}
