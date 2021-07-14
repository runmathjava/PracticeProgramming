/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class ExWithBreak {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a day of a week: ");
        String stringDay = sc.nextLine();
        day = Integer.parseInt(stringDay);
        String dayType;
        
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break; // No berak here causes every day with 1 through 7 to be Weekend
            case 6:
            case 7:
                dayType = "Weekend";
                break; // if this break is removed every day will be Invalid
            default:
                dayType = "Invalid";
        }
        System.out.println(dayType);
    }
    
}
