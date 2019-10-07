/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class11exercises;

import java.lang.Math;
/**
 * Title: 11-1 Exercise Problem 1
 * Objective: Searches an array for a max number 
 * Author: Thanh Tran
 * Date: m-dd-yyyy
 */
public class MaxNumber {
    
       public static void main (String[] args) {
           
           double[] r = new double [100];      // declare and create an array
           
           // initialize the array with random numbers
           for (int i = 0; i < r.length; i++){
               r[i] = Math.random()*100;
  
       }
           System.out.println("Array of 100 Random Generated numbers");
           
           // a for loop that requires the program to execute and print out a random number 10 times and reloops again
           for(int i = 0; i < r.length; i++){       // reloops if i is not divisible by 10 
               System.out.printf("%6.2f ", r[i]);    // prints out a random number 
               
            // checks for if i is divisible by 10 and prints a new line
               if((i+1) % 10 == 0)        
                   System.out.println();
           }
           
           // declare variables
           double max = r[0];
           int indexOfMax = 0;
           
           // checks every index for max value
           for (int i = 1; i < r.length; i++){
               if (r[i] > max) 
                   max = r[i];       // stores the value on index i of r as the max number
                   indexOfMax = i;  // updates the index of the max number
           }
           System.out.printf("max: %.2f \n", max);
           System.out.print("I found the first occurence of the largest value in the array");
    }
}
