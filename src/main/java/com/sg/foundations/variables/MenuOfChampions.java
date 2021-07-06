/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class MenuOfChampions {
    public static void main(String[] args) {
        
        float priceOfLuckyPasta, priceOfInfinitySteak, priceOfFantasticFriedRice;
        String stringPriceOfLuckyPasta, stringPriceOfInfinitySteak;
        String stringPriceOfFantasticFriedRice;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the prie of Lucky Pasta: ");
        stringPriceOfLuckyPasta = sc.nextLine();
        priceOfLuckyPasta = Float.parseFloat(stringPriceOfLuckyPasta);
        
        System.out.println("Enter the price of Infinity Steak: ");
        stringPriceOfInfinitySteak = sc.nextLine();
        priceOfInfinitySteak = Float.parseFloat(stringPriceOfInfinitySteak);
        
        System.out.println("Enter the price of Fantastic Fried Rice: ");
        stringPriceOfFantasticFriedRice = sc.nextLine();
        priceOfFantasticFriedRice = Float.parseFloat(stringPriceOfFantasticFriedRice);
            
        System.out.println("_   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _");
        System.out.println(",-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)");
        System.out.println("`-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-'");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("              Welcome to All You Want to Enjoy!");
        System.out.println("              PLease be happy to choose any of those below.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("$ " + priceOfLuckyPasta + " -------------- Lucky Pasta");
        System.out.println("S " + priceOfInfinitySteak + " -------------- Infinity Steak");
        System.out.println("S " + priceOfFantasticFriedRice + " ----------- Fantastic Fried Rice");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("_   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _");
        System.out.println(",-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)");
        System.out.println("`-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-'");
        }
    
}
