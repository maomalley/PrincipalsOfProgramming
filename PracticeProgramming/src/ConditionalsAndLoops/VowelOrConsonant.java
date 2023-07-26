/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalsAndLoops;

import java.util.Scanner;   // Needed to read user input

/**
 *
 * @author Maureen O'Malley
 */
public class VowelOrConsonant {
    public static void main (String[] args){
        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // Print a message and get user's character
        System.out.println("Please enter a single character to determine if it "
                + "is a vowel or consonant.");
        char userChar = keyboard.next().charAt(0);
        
        while(userChar == 'a'){
            
        }
    }
}
