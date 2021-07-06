/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;
/**
 *
 * @author aboxi
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
     /* opinion = "Awesome";
        size = "teenzy-weenzy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";
        
        noun = "dragons";
      */  
               
     /* Using the + with strings doesn't add -- it concatenates! (sticks them together)
        
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        
        If the variable are initalized the way below, we may can remove all the double quotes.
     */   
        opinion = " Awesome";
        size = " teenzy-weenzy";
        age = " new";
        shape = " oblong";
        color = " yellow";
        origin = " Martian";
        material = " platinum";
        purpose = " good";
        
        noun = " dragons";
     
        System.out.println(number+opinion+size+age+shape+color+origin+material+purpose+noun);
        
    }
    
}
