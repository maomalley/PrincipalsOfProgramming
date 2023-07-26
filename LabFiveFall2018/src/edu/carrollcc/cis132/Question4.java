package edu.carrollcc.cis132;

import java.util.Scanner;                   // Needed to read user input
import edu.carrollcc.cis132.q4.Rectangle;   // Needed to use Rectangle class

/**
 * Question 4 [5 BONUS Points] - TRY IT it won't count against you!
 *
 * Write a Rectangle Class with three fields that has a constructor with three parameters, 
 *  integers width and length
 *  character drawChar
 * The class will have a method called printOutline that prints a rectangle to the 
 * console that is the outline based on the dimensions width and length.
 * The method will use the character drawChar as its outline character. The method
 * should use nested for loops to print the output.
 * 
 * The main method will demonstrate this class by asking the user for width, length and 
 * a draw character. It will call the constructor with these values and then
 * draw a rectangle outline to the console.
 * Input Validation: Do not allow the user to enter negative numbers for length and width.
 * Loop until they enter a positive value.
 * 
 * Example Output 1:
 * Please enter a positive integer width: 
 * 4
 * Please enter a positive integer length:
 * 5
 * Please enter a character for your drawing:
 * $
 * 
 * $$$$
 * $  $
 * $  $
 * $  $
 * $$$$
 * 
 * Example Output 2:
 * Please enter a positive integer width: 
 * -1
 * INVALID - enter a positive integer width:
 * 6
 * Please enter a positive integer length:
 * -8
 * INVALID - enter a positive integer length:
 * 10
 * Please enter a character for your drawing:
 * !
 * 
 * !!!!!!
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !!!!!!
 * 
 * @author Maureen OMalley
 */
public class Question4 {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);   // Create Scanner object
       
       // Get and store user's desired shape width
       System.out.println("Please enter a positive integer width:");
       int userWidth = keyboard.nextInt();
       
       // Input Validation: if a negative number is entered, loop until user
       // enters a positive width
       while(userWidth < 0){
           System.out.println("INVALID - enter a positive integer width:");
           userWidth = keyboard.nextInt();
       }
       
       // Get and store user's desired shape length
       System.out.println("Please enter a positive integer length:");
       int userLength = keyboard.nextInt();
       
       // Input Validation: if a negative number is entered, loop until user
       // enteres a positive length
       while(userLength < 0){
           System.out.println("INVALID - enter a positive integer length:");
           userLength = keyboard.nextInt();
       }
       
       // Get and store user's desired shape character
       System.out.println("Please enter a character for your drawing:");
       char userChar = keyboard.next().charAt(0);
       
       // Create a rectangle object, passing ints userWidth and userLength as
       // well as char userChar to the three parameter constructor.
       Rectangle r = new Rectangle(userWidth, userLength, userChar);
       
       // User the Rectangle class printOutline method to print the shape
       r.printOutline();
    }
   
}
