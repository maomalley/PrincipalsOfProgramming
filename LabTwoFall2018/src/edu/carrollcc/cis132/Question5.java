package edu.carrollcc.cis132;

import java.util.Scanner;
/**
 * Question 5 [10 points].
 * A cookie recipe uses the following ingredients:
 * 1 cup of butter
 * 1.75 cups of sugar
 * 3.25 cups of flour
 *
 * The recipe makes 60 cookies with these amounts of the ingredients.
 * Write a program that asks the user how many cookies he or she wants to make.
 * Divide the number of desired cookies by 60 to find the ratio to adjust the 
 * recipe. Multiply that ratio times each ingredient amount and display
 * the number of cups needed for each ingredient.
 * 
 Example output:

 How many cookies would you like to make?
 30

 You need:
 .5 cups of butter
 .875 cups of sugar
 1.625 cups of flour

 * Use good programming style!
 * 
 * @author Maureen OMalley
 */

 public class Question5 {
     public static void main(String[] args){
         
         double cookies;
         Scanner keyboard = new Scanner(System.in);
         
         //Get the desired cookie amount
         System.out.print("How many cookies would you like to make?\n");
         cookies = keyboard.nextDouble();
        
         double ratio = cookies/60;
         double butter = ratio * 1;
         double sugar = ratio * 1.75;
         double flour = ratio * 3.25;
        
         System.out.print("\nYou need:\n" +
             butter + " cups of butter\n" +
             sugar + " cups of sugar\n" +
             flour + " cups of flour\n");
     }
 }