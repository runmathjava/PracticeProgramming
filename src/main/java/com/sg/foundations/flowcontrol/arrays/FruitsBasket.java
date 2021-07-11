/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author aboxi
 */
public class FruitsBasket {
    public static void main(String[] args) {
        
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};
        
        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        int total = 0;
        /*
        // traditional for-loop
        for (int i = 0; i < fruitBasket.length; i++){
            
            if (fruitBasket[i].equals("Orange")){
                numOranges++;
            }else if (fruitBasket[i].equals("Apple")){
                numApples++;
            }else{
                numOtherFruit++;
            }
            total++;
        }
        
        // enhanced for-loop
        for (String currentFruit : fruitBasket){
            if (currentFruit.equals("Orange")){
                numOranges++;
            }else if (currentFruit.equals("Apple")){
                numApples++;
            }else{
                numOtherFruit++;
            }
            total++;
        }
        */
        // enhanced for-loop with switch
        for (String currentFruit : fruitBasket){
            
            switch (currentFruit){
                case "Orange":
                    numOranges++;
                    break;
                case "Apple":
                    numApples++;
                    break;
                default:
                    numOtherFruit++;
            }
            total++;
        }
        
        System.out.println("Total number of fruit in the basket: " + total);
        System.out.println("The number of apples: " + numApples);
        System.out.println("The number of oranges: " + numOranges);
        System.out.println("The number of other fruit: " + numOtherFruit);
    }
    
}
