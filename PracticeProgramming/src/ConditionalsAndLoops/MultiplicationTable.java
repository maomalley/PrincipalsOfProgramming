package ConditionalsAndLoops;

import java.util.Scanner;

/**
 * This program displays multiplication tables up to a user-specified number.
 * @author Maureen O'Malley
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int userInt;
        
        System.out.println("Please enter a number:");
        userInt = keyboard.nextInt();
        
        int loopNumber = 0;
        
        while(loopNumber <= userInt) {
            int product = loopNumber * userInt;
            System.out.printf("%d X %d = %d\n", loopNumber, userInt, product);
            loopNumber++;
        }
        
    }
}
