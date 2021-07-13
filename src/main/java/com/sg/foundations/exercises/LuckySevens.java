/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class LuckySevens {
    public static void main(String[] args) {
        
        int dollars, max, rollAtMax, rolls, dice1, dice2;
        String stringDollars;
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("How many dollars do you have to bet? ");
        stringDollars = sc.nextLine();
        dollars = Integer.parseInt(stringDollars);
        max = dollars;
        rollAtMax = 0;
        rolls = 0;
        while (dollars > 0){
            dice1 = rd.nextInt(6) + 1;
            dice2 = rd.nextInt(6) + 1;
            rolls++;
            if ((dice1 + dice2) == 7){
                dollars += 4;
            }else{
                dollars--;
            }
            System.out.println("(dice1, dice2) = (" + dice1 + ", " + dice2 + ")" );
            System.out.println("$" + dollars + " after " + rolls + " rolls.");
            if (dollars > max){
                max = dollars;
                rollAtMax = rolls;
            }
        }
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + rollAtMax + " rolls when you had $" + max + ".");
    }
}
