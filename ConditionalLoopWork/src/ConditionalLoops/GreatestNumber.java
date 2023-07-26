package ConditionalLoops;

import java.util.Scanner;   // Needed to read user input

/**
 * This program accepts 3 numbers from the user and displays the greatest
 * of the three numbers.
 * @author Maureen OMalley
 */
public class GreatestNumber {
    public static void main(String [] args){
        double firstNumber;     // field to hold the user's first number
        double secondNumber;    // field to hold the user's second number
        double thirdNumber;     // field to hold the user's third number
        
        // Create a Scanner object to read user input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get and store the first number.
        System.out.println("Please enter the first number you'd like to test:");
        firstNumber = keyboard.nextDouble();
        
        // Get and store the second number.
        System.out.println("Please enter the second number you'd like to test:");
        secondNumber = keyboard.nextDouble();
        
        // Get and store the third number.
        System.out.println("Please enter the third number you'd like to test:");
        thirdNumber = keyboard.nextDouble();
        
        // Display the greatest number
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The greatest number of those three is: " + 
                    firstNumber);
        } else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("The greatest number of those three is: " + 
                    secondNumber);
        } else{
            System.out.println("The greatest number of those three is: " + 
                    thirdNumber);
        }
    }
}
