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
public class BestAdderEver {
    public static void main(String[] args) {
        
        double operand1, operand2, operand3, result;
        String stringOperand1, stringOperand2, stringOperand3;
        
        // declare and initialize the Scanner
        Scanner sc = new Scanner(System.in);
        
        // get the operands from the user
        System.out.println("Enter the first operand: ");
        stringOperand1 = sc.nextLine();
        
        System.out.println("Enter the second operand: ");
        stringOperand2 = sc.nextLine();
        
        System.out.println("Enter the third operand: ");
        stringOperand3 = sc.nextLine();
        
        // convert string values to float values
        operand1 = Double.parseDouble(stringOperand1);
        operand2 = Double.parseDouble(stringOperand2);
        operand3 = Double.parseDouble(stringOperand3);
        
        // Calculate operand1 times operand2 to the third power minus operand3 squared
        result = operand1 * Math.pow(operand2, 3) - Math.pow(operand3, 2);
        
        // display the result of the math operations above
        System.out.println(operand1 + " x " + operand2 + "^" + 3 + " - " 
                + operand3 + "^" + 2 + " = " + result);
    }
}
