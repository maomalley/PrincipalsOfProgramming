package edu.carrollcc.cis132;

/**
 * Question 4 [10 points].
 * There are 12 inches in a foot and 3 feet in a yard.  Write a program
 * that calculates the number of inches in 4,602,400 yards (distance from 
 * Westminster, MD to San Diego, CA).
 * 
 * Use constants to represent inches in a foot and feet in a yard.
 * 
 * Print the result with an informative message to the console.  
 * Make sure to comma separate the number output!
 * (Hint: use printf!)
 * 
 * Use good programming style!
 * 
 * @author Maureen OMalley
 */
 public class Question4 {
     public static void main(String[] args)
     {
         final double DISTANCE_IN_YARDS = 4602400.0;
         final double INCHES_IN_A_FOOT = 12.0;
         final double FEET_IN_A_YARD = 3.0;
        
         double distanceInInches = DISTANCE_IN_YARDS * INCHES_IN_A_FOOT *
                FEET_IN_A_YARD;
        
         System.out.printf("The distance from Westminster, MD to "
                            + "San Diego, CA is %,.2f inches.\n", distanceInInches);
     }
 }
