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
public class InABucket {
    
    public static void main(String[] args) {
        
        // You can declare all kinds of variables.
        String walrus;
        String stringWeightOfTeacupPig;
        String stringNumberOfTeacupPigs;
        String stringGrainsOfSand;
        String stringWeightOfGrainOfSand;
        double piesEaten;
        float weightOfTeacupPig;
        float weightOfGrainOfSand;
        float totalWeight;
        int grainsOfSand;
        int numberOfTeacupPigs;
        
        Scanner sc = new Scanner(System.in);
        
        // But declaring them just sets up the space data
        // to use the variable, you have to put data in it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        
        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies: ");
        System.out.println(piesEaten);
        
        // get the weight of the average weight of a teacup pig
        System.out.println("Enter the average weight of a teaccup pig in pounds: ");
        stringWeightOfTeacupPig = sc.nextLine();
        
        // convet the string value to float value
        weightOfTeacupPig = Float.parseFloat(stringWeightOfTeacupPig);
        
        // get the number of teacup pigs
        System.out.println("Enter the number of the teacup pigs: ");
        stringNumberOfTeacupPigs = sc.nextLine();
        
        // convert the string value to integer value
        numberOfTeacupPigs = Integer.parseInt(stringNumberOfTeacupPigs);
        
        // Clculate the total weight of the teacup pigs
        totalWeight = numberOfTeacupPigs * weightOfTeacupPig;
        
        // disply the total weight of the teacup pigs
        System.out.print("The total weight of the teacup pigs is ");
        System.out.println(totalWeight + " pounds");
        
        // get the number of grains of sand a tea spoon get hold
        System.out.println("How many grains of sand do you thik a tea spoon can hold?");
        stringGrainsOfSand = sc.nextLine();
        
        // convert the string value to integer value
        grainsOfSand = Integer.parseInt(stringGrainsOfSand);
        
        // get the average weight of a grain of sand the user estimates
        System.out.println("How heavy do you think a grain of sand is in average in grams?");
        stringWeightOfGrainOfSand = sc.nextLine();
        
        // Convert the sring value to float value
        weightOfGrainOfSand = Float.parseFloat(stringWeightOfGrainOfSand);
        
        // Calculate the total wight of grains of sand in a tea spoon
        totalWeight = grainsOfSand * weightOfGrainOfSand;
        
        // display the weith of a tea spoonful of grains of sand
        System.out.print("The weight of a tea spoonful of grains of sand is ");
        System.out.println(totalWeight + " gram");
    }
    
}
