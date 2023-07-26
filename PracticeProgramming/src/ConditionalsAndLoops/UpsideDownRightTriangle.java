/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalsAndLoops;

import java.util.Scanner;

/**
 *
 * @author Maureen O'Malley
 */
public class UpsideDownRightTriangle {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int loopNumber;
        
        System.out.println("Please enter a positive number:");
        loopNumber = keyboard.nextInt();
        
        while(loopNumber >= 0){
            System.out.println("Error. Please enter a positive number.");
            loopNumber = keyboard.nextInt();
        }
        
        
    }
}