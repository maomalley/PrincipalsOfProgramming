package edu.carrollcc.cis132;

import edu.carrollcc.cis132.q3.TicketCalc;  //Needed to use TicketCalc class
import java.util.Scanner;                   //Needed for keyboard input

/**
 * Question 3 [20 Points]
 * Westminster police are going to install speed cameras on roads around town. 
 * Write a program that determines if the violator will receive a warning, speeding
 * ticket, or reckless driving ticket with points. 
 * 1. You will need to create a class called TicketCalc in the edu.carrollcc.cis132.q3 
 * package. 
 * 2. The class should have 2 fields, one for speed limit and the other for the 
 * violator's speed. 
 * 3. Write a constructor that takes 2 parameters representing speed limit and violator's speed.
 * 4. Write a method in the class that uses conditional statements to determine what 
 * type of ticket the violator will receive based on how fast they were going.
 * It should return a String.
 *      -Less than 12 miles over the speed limit:
 *		You receive a warning.
 *	- 12 miles or more and less than 20 miles over the speed limit:
 *		You receive a speeding ticket with a $200.00 fine.
 *	- 20 miles or more and less than 25 miles over the speed limit:
 *		You receive a speeding ticket with a $300.00 fine and 2 points.
 *	- 25 miles or more and less than 40 miles over the speed limit:
 *		You receive a reckless driving ticket with $500.00 fine and 5 points.
 *	- 40 miles or more over the speed limit:
 *		You receive a reckless driving ticket with $1000.00 fine and 12 points.
 * 
 * 5. You may choose to use console input/output OR Dialog boxes (Don't use both).
 * 
 * 6. Comments and style are worth up to 2 points.
 * 7. Use JAVADOC comments to document your class description, constructor and 
 * methods (do not need them for setters and getters).
 * 
 * @author Maureen OMalley
 */

/**
 * This program demonstrates the use of the TicketCalc class to determine
 * what ticket the violator will receive given the speed limit and violator's
 * speed.
 */
public class Question3 
{
    public static void main(String[] args)
    {
        //Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        int numLmt;   //field to hold the user's speed limit
        int numSpd;   //field to hold the user's violator speed
        
        //Get and store the speed limit
        System.out.println("What is the speed limit?");
        numLmt = keyboard.nextInt();
        
        //Get and store the violator's speed
        System.out.println("What is the violator's speed?");
        numSpd = keyboard.nextInt();
        
        //Create TicketCalc object and send the following parameters to constructor:
        //numLmt, the user's speed limit, is stored as the parameter limit
        //numSpd, the user's violator speed, is stored as the parameter spd
        TicketCalc newSpeed = new TicketCalc(numLmt, numSpd);
        
        //Use the TicketCalc class's getTicket method to determine what the
        //violator will receive.
        System.out.println(newSpeed.getTicket());
    }

}