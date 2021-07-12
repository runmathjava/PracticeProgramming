/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.exercises;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class InterestCalculator {
    public static void main(String[] args) {
        
        String stringPrincipal, stringYears, stringARate, stringTerm;
        float f = 1.0f, interest, aRate, principal;
        int years;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the annual interest rate in %: ");
        stringARate = sc.nextLine();
        aRate = Float.parseFloat(stringARate);
        aRate /= 100.0f;

        System.out.println("Enter the term compounded.");
        System.out.println("If anually, enter a ");
        System.out.println("If quarterly, enter q ");
        System.out.println("If monthly, endter m");
        System.out.println("If daily and leap year, enter dl ");
        System.out.println("If daily and not leap year, enter dn ");
                
        /*
        if (stringTerm.equals("a")){
            f = 1.0f;
        }else if (stringTerm.equals("q")){
            f = 4.0f;
        }else if (stringTerm.equals("m")){
            f = 12.0f;
        }else if (stringTerm.equals("dl")){
            f = 366.0f;
        }else if (stringTerm.equals("dn")){
            f = 365.0f;
        }else{
            System.out.println("Bad input. Pls try again.");
        }
        */
        boolean found = false;
        while (!found){
            stringTerm = sc.nextLine();
            switch (stringTerm) {
                case "a":
                    f = 1.0f;
                    found = true;
                    break;
                case "q":
                    f = 4.0f;
                    found = true;
                    break;
                case "m":
                    f = 12.0f;
                    found = true;
                    break;
                case "dl":
                    f = 366.0f;
                    found = true;
                    break;
                case "dn":
                    f = 365.0f;
                    found = true;
                    break;
                default:
                    System.out.println("Bad input. Pls try again. ");
            }
        }
        
        System.out.println("Enter the initial amount of principal: ");
        stringPrincipal = sc.nextLine();
        principal = Float.parseFloat(stringPrincipal);
        
        System.out.println("Enter the number of years the money is to stay in the fund: ");
        stringYears = sc.nextLine();
        years = Integer.parseInt(stringYears);
        
        for (int i = 1; i <= years; i++){
        
            float totalAtYearEnd = findTheTotal(principal, aRate, f);
            interest = totalAtYearEnd - principal;
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + principal);
            System.out.println("Earned $" + interest);
            System.out.println("Ended with $" + totalAtYearEnd);
            System.out.println("");
            principal = totalAtYearEnd;
        }
    }
    
    public static float findTheTotal(float principal, float aRate, float f){
        
        float tRate, m, tT;
        
        /* if anually, f = 1; if quarterly, f = 4; if monthly, f = 12;
           if daily and not leap year, f = 365;
           if daily and leap year, f = 366
        */
        tRate = aRate/f;
        m = 1.0f + tRate;
        tT = principal;
        for (int i = 1; i <= f; i++){
            tT = tT * m;
        }
        return tT; // return the total at year end
    }
}
