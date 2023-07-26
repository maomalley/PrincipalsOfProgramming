package edu.carrollcc.cis132;
import edu.carrollcc.cis132.q2.CombinedShipping; //Needed for the CombinedShipping class
import java.util.Scanner;                        //Needed for the Scanner class
/**
 * Question 2 [20 Points]
 * CombinedShipping Class.
 * 
 * The cBay Shipping Company charges the following rates:
 * 
 * Number of Items                          Flat Rate per 500 miles shipped
 * 1 item                                   $3.50
 * 2 - 5 items                              $4.50
 * 6 -10 items                              $7.50
 * 11 or more items                         $9.50
 * 
 * Print a welcome message that includes the above list of 
 * shipping charges.
 * 
 * The shipping charges per 500 miles are not prorated. For example, if 1 item
 * is shipped 550 miles, the shipping charge would be $7.00. If 1 item is shipped 
 * 1100 miles, the charge would be $10.50.
 * 
 * Design a class in the edu.carrollcc.cis132.q2
 * package that stores the number of items, miles shipped, and has a method that 
 * returns the shipping charge as a double or float. 
 * 
 * Don't forget your setters and getters.
 * 
 * Make sure you format your shipping charges to have a $ sign and 2 decimal places
 * when you print them.
 * You may choose to use console input/output OR Dialog boxes (Don't use both).
 * If using Dialog boxes, only use 1 Dialog box for the Welcome message.
 * 
 * Sample Output #1:
 * ********************
 * Welcome to cBay Shipping Company
 * Number of Items                          Flat Rate per 500 miles shipped
 * 1 item                                   $3.50
 * 2 - 5 items                              $4.50
 * 6 -10 items                              $7.50
 * 11 or more items                         $9.50
 *  
 * How many items are you combining to ship?
 * 3
 * How many miles?
 * 600
 * Your shipping charge is $9.00.
 * 
 * Sample Output #2:
 * *******************
 * Welcome to cBay Shipping Company
 * Number of Items                          Flat Rate per 500 miles shipped
 * 1 item                                   $3.50
 * 2 - 5 items                              $4.50
 * 6 -10 items                              $7.50
 * 11 or more items                         $9.50
 
 * How many items are you combining to ship?
 * 1
 * How many miles?
 * 350
 * Your shipping charge is $3.50
 * 
 * (Hint: Use if-else statements to find the flat rate per 500 miles shipped. Then use
 * a method to calculate how much shipping will be charged based on the mileage entered.
 * You can use Math.ceil(double val) method to find value to multiply your flat rate charge by.
 * Math.ceil(double val) is passed a double value and will return the "ceiling" 
 * (rounds up to the nearest whole number as a double). 
 * For instance: 
 * Math.ceil(1.56); //returns 2.0
 * Math.ceil(.43); //returns 1.0
 * The Math class is already imported to your program through java.lang.Math
 * 
 * Comments and style are worth up to 2 points.
 * Use JAVADOC comments to document your class description, constructor and 
 * methods (do not need them for setters and getters).
 * 
 * @author Maureen OMalley
 */

/**
 * This class demonstrates the use of the CombinedShipping class.
 */

public class Question2 {

    public static void main(String[] args) {
        //To hold the input
        double number;
        
        //Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Create a CombinedShipping object
        CombinedShipping c = new CombinedShipping();
        
        //Print the welcome message and shipping charges list
        System.out.print("Welcome to cBay Shipping Company\nNumber of Items"
                + "                          Flat Rate per 500 miles shipped\n"
                + "1 item                                   $3.50\n"
                + "2 - 5 items                              $4.50\n"
                + "6 - 10 items                             $7.50\n"
                + "11 or more items                         $9.50\n\n");
        
        //Get and store the items shipped
        System.out.println("How many items are you combining to ship?");
        number = keyboard.nextDouble();
        c.setItms(number);
        
        //Get and store the miles shipped
        System.out.println("How many miles?");
        number = keyboard.nextDouble();
        c.setMiles(number);
        
        //Display the shipping charge.
        System.out.printf("Your shipping charge is $%.2f\n", c.getCharge());        
    }
    
}