package edu.carrollcc.cis132;

/**
 * SpeedCalculator Class [25 points].
 *
 * Design a SpeedCalculator class in the edu.carrollcc.cis132.q2 package that has
 * fields to hold a distance in miles and a time in hours. Both fields must be
 * able to hold floating point values.
 * The class should have accessor (getter) and mutator (setter) methods for the 
 * distance and time fields and a method that calculates and returns the speed 
 * in miles per hour as a floating point value.
 *
 * Demonstrate the class by writing a program in the Question2 main method that
 * creates an instance of the class. It should input data from the keyboard, 
 * then calculate the speed traveled in miles per hour using the instance method.
 * 
 * The program should ask the user to enter miles traveled and hours traveled 
 * then store them in a SpeedCalculator object. The program should use the 
 * instance method for calculating speed and display it in a message. 
 * Format the speed to 2 decimal places.
 *
 * Style is worth up to 2 points.
 *
 * Example Output
 * --------------
 * How many miles traveled?
 * 181.0
 * How many hours traveled?
 * 3.2
 * The average speed for your trip is 56.56 miles per hour.
 * --------------
 * 
 * @author Maureen OMalley
 */
import java.util.Scanner;   //To use keyboard input
import edu.carrollcc.cis132.q2.SpeedCalculator;

//This class demonstrates the use of the SpeedCalculator class.
public class Question2 
{
    public static void main(String[] args)
    {
        //To hold the input
        double number;
        
        //Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Create a SpeedCalculator object
        SpeedCalculator speed = new SpeedCalculator();
        
        //Get and store the miles traveled
        System.out.println("How many miles traveled?");
        number = keyboard.nextDouble();
        speed.setMiles(number);
        
        //Get and store the hours traveled
        System.out.println("How many hours traveled?");
        number = keyboard.nextDouble();
        speed.setHours(number);
        
        //Display the average speed for the trip
        System.out.printf("The average speed for your trip is %,.2f miles per "
                + "hour.", speed.getSpeed());
        
    }
}
