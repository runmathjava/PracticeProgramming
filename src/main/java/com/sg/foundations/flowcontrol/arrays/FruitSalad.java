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
public class FruitSalad {
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple",
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple",
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple",
            "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        final int MAX = 12;
        int maxApples = 3, maxOranges = 2, numOfBerries = 0, numOfApples = 0,
            numOfOranges = 0, kindsOfFruit = 0, j = 0;
        
        
        String[] fruitSalad = new String[MAX];
        
        for (int i = 0; i < fruit.length; i++){
            
            switch (fruit[i]){
                case "Kiwi Fruit":
                case "Blueberry":
                case "Strawberry":
                case "Raspberry":
                case "Blackberry":
                case "Banana":
                case "Snozzberry":
                    if (kindsOfFruit < MAX){
                    fruitSalad[j] = fruit[i];
                    j++;
                    numOfBerries++;
                    kindsOfFruit++;
                    }
                    break;
                    
                case "Gala Apple":
                case "Granny Smith Apple":
                case "Braeburn Apple":
                case "Pink Pearl Apple":
                case "Fuji Apple":
                case "Kiku Apple":
                    if (numOfApples < maxApples){
                        numOfApples++;
                        fruitSalad[j] = fruit[i];
                        j++;
                        kindsOfFruit++;
                    }
                    break;
                case "Navel Orange":
                case "Blood Orange":
                case "Florida Orange":
                case "Satsuma Orange":
                    if (numOfOranges < maxOranges){
                        numOfOranges++;
                        fruitSalad[j] = fruit[i];
                        j++;
                        kindsOfFruit++;
                    }
                    break;
            }
        }
        System.out.println("The frut salad is made of fruit as follows.");
        System.out.println("");
        for (String entry : fruitSalad){
            System.out.println(entry);
        }
    }
    
}
