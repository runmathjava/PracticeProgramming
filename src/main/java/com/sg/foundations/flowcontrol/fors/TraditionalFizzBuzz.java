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
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String stringNum;
        int n, r3, r5, r15, fAndZCount = 0, num;
        System.out.println("How many units of fizzing and bussing do you need in your life? ");
        // stringNum - sc.nextLine();
        // num = Integer.parseInt(stringNum);
        num = Integer.parseInt(sc.nextLine());
        System.out.println("0");
        n = 1;
        while (fAndZCount < num){
            r3 = n%3;
            r5 = n%5;
            r15 = n%15;
            if (r15 == 0){
                System.out.println("fizz buzz");
                fAndZCount++;
            }else if (r3 == 0){
                System.out.println("fizz");
                fAndZCount++;
            }else if (r5 == 0){
                System.out.println("buzz");
                fAndZCount++;
            }else{
                System.out.println(n);
            }
            n++;
        }
        System.out.println("TRADITION!!!!");
    }
    
}
