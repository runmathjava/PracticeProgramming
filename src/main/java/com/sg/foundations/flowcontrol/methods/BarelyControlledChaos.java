/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author aboxi
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = findColor(); //call color method here
        
        String animal = findAnimal(); // call animal method here
        
        String colorAgain = findColor(); // call color method again here
        
        int weight = findNumber(5, 200); // call number method,
                                   // with a range between 5 - 200
        
        int distance = findNumber(10, 20); // call number method, with a range
                                     // between 10 - 20
        
        int number = findNumber(10000, 20000); //call number method,
                                   // wiht a range between 10000 - 20000
        
        int time = findNumber(2, 6); // call number method,
                                  // with a range between 2 - 6
        
        System.out.println("Once, when I was very small...");
        
        System.out.println("I was chased by a " + color + ", " + weight
                + "lb minuature " + animal + " for over " + distance + " miles!!");
        
        System.out.println("I had to hide in a field of over " + number + " "
                + colorAgain + " poppies for nearly " + time
                + " hours until it left me alone!");
        
        System.out.println("\nIt was QUITE the experience, let me tell you!");
        
    }
    
    public static String findColor(){
        
        Random rndmzr = new Random();
        int choice = rndmzr.nextInt(5);
        
        switch (choice){
            case 0:
                return "red";
            case 1:
                return "blue";
            case 2:
                return "white";
            case 3:
                return "yellow";
            case 4:
                return "black";
            default:
                return "no color";
        }
    }
    
    public static String findAnimal(){
        
        Random rndmzr = new Random();
        int choice = rndmzr.nextInt(5);
        if (choice == 0){
            return "tiger";
        }else if (choice == 1){
            return "lion";
        }else if (choice == 2){
            return "horse";
        }else if (choice == 3){
            return "deer";
        }else if (choice == 4){
            return "rabbit";
        }else{
            return "unknown animal";
        } 
        
    }
    
    public static int findNumber(int min, int max){
        
        Random rndmzr = new Random();
        int choice = rndmzr.nextInt(max - min) + min;
        return choice;
    }
}
