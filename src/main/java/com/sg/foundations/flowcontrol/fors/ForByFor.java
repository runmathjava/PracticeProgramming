/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author aboxi
 */
public class ForByFor {
    public static void main(String[] args) {
        /*
        for(int i=0;i<3;i++){
            System.out.print("|");
            
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.print("*");
                }
                System.out.print("|");
            }
            System.out.println("");
        }
        */
        
        int r1, r2;
        final int N = 5;
        for(int i=0;i<N;i++){
            System.out.print("|");
            
            r1 = i%2;
            if (r1 == 0){
                for(int j=0;j<N;j++){
                    r2 = j%2;
                    if (r2 == 0){
                        for(int k=0;k<N;k++){
                            System.out.print("*");
                        }
                    }else{
                        for(int k=0;k<N;k++){
                            System.out.print("$");
                        }
                    }
                    System.out.print("|");
                }
            }else{
                for(int j=0;j<N;j++){
                    r2 = j%2;
                    if (r2 == 0){
                        for(int k=0;k<N;k++){
                            System.out.print("@");
                        }
                    }else{
                        for(int k=0;k<N;k++){
                            System.out.print("#");
                        }
                    }
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
    }
    
}
