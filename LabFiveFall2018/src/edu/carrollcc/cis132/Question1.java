package edu.carrollcc.cis132;

import java.util.Scanner;   //Needed for the Scanner class

/**
 * Question 1 [10 Points]
 * Nickels for Pay.
 * 
 * Write a program that calculates how much a person would earn over a period
 * of time if his or her salary is one nickel the first day, two nickels the
 * second day, four nickels the third day, eight nickels the fourth day and 
 * continues to double each day.  
 * The program should display a table showing the salary for each day, and then 
 * show the total pay.  
 * The output should be displayed in a dollar amount,
 * not the number of nickels.
 *
 * 
 * Input Validation: Do not accept a number less than one for the number of
 * days worked.
 * 
 * Example Output:
How many days were worked?
5
Day             Amount
1               $0.05
2               $0.10
3               $0.20
4               $0.40
5               $0.80

Total           $1.55
 * 
 * Comments and style are worth up to 2 points.
 * 
 * @author Maureen OMalley
 */
/**
 * This program calculates how much the user earns over a number of days.
 * The user earns one nickel the first day, two the next, and it continues to
 * double each day.
 * @author Maureen
 */
public class Question1 {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);
        
        int numDays;            // To hold the user's num of days worked
        double salary = 0.05;   // To hold the salary
        double totalSal = 0;    // To hold the salary total
        int day = 1;            // To hold the day number
        
        // Get and store the number of days worked
        System.out.println("How many days were worked?");
        numDays = keyboard.nextInt();
        
        // Input Validation: if the user enters a number less than one,
        // try again.
        while(numDays < 0) {
            System.out.println("Error: Please enter a positive number of"
                    + " days worked.");
            // Get and store the number of days worked
            System.out.println("How many days were worked?");
            numDays = keyboard.nextInt();            
        }
        
        //Display menu header
        System.out.print("Day             Amount\n");
        // while loop displays day number and salary for that day.
        // salary is doubled each day
        while(numDays > 0) {
            System.out.printf("%d\t\t%.2f\n", day, salary);
            totalSal += salary;
            salary *= 2;
            day++;
            numDays--;
        }
        // Print the total
        System.out.printf("\nTotal:\t\t%.2f",totalSal);
    }
    

}