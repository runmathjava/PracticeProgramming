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
public class Factorizer {
    public static void main(String[] args) {
        
        int i, j, k, q, sum, num, numOfFactors = 1; 
        boolean prime = false, perfect = false;
        String stringNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        stringNum = sc.nextLine();
        num = Integer.parseInt(stringNum);
        int[] factors = new int[num];
        
        for (i = 0; i < num; i++){
            factors[i] = 1;
        }
        j = 0;
        for (i = 2; i < num; i++){
            q = num % i;
            if (q == 0){
                j++;
                factors[j] = i;
                numOfFactors++;
            }
        }
        j++;
        factors[j] = num; 
        numOfFactors++;
        System.out.println("The factors of " + num + " are:");
        for (k = 0; k < j+1; k++){
            System.out.print(factors[k] + " ");
        }
        System.out.println(" ");
        System.out.println(num + " has " + numOfFactors + " factors.");
        
        if (numOfFactors > 2){
            System.out.println(num + " is not a prime number.");
        }else{
            System.out.println(num + " is a prime number.");
            prime = true;
        }
        if (!prime){
            sum = 0;
            for (i = 0; i < j; i++){
                sum += factors[i];
            }
            if (sum == num){
                System.out.println(num + " is a perfect number.");
            }else{
                System.out.println(num + " is not a perfect numer.");
            }
        }
    }
    
}
