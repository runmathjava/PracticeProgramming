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
public class SimpleCombination {
    public static void main(String[] args) {
        
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49};
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100};
        
        int[] wholeNumbers = new int[24];
        
        for (int i = 0; i < 24; i++){
            if (i < firstHalf.length){
                wholeNumbers[i] = firstHalf[i];
            }else{
                wholeNumbers[i] = secondHalf[i - 12];
            }
        }
        System.out.println("All together now!:");
        for (int i = 0; i < wholeNumbers.length; i++){
            System.out.print(wholeNumbers[i] + " ");
        }
    }
    
}
