package edu.carrollcc.cis132;

import java.util.Scanner;                       // Needed for user input
import edu.carrollcc.cis132.q2.FortuneTeller;   // Needed for FortuneTeller class

/**
 * Question 2 [15 Points]
 * FortuneTeller.
 * 
 * Write a program that creates a FortuneTeller class in the edu.carrollcc.cis132.q2
 * package.
 * Display a message welcoming the user to the program and ask them to type a 
 * Yes/No question (one that can only be answered with Yes or No) and hit <enter>. 
 * If they are finished using the FortuneTeller, 
 * they should enter Goodbye to let the program know they are finished.
 * (HINT #1: it doesn't matter what the question is, unless they entered 'Goodbye')
 * The class should have a readFortune method that displays a message in response
 * to their question.
 * It should use the Random number generator and randomly return 
 * one of the following answers: (There are 9, the number represents the random
 * number that is generated)
 * 1 - Most likely.
 * 2 - It is certain.
 * 3 - Yes, definitely!
 * 4 - Signs point to yes.
 * 5 - Ask again later.
 * 6 - Concentrate and ask again.
 * 7 - My sources say NO.
 * 8 - Don't count on it!
 * 9 - You've got to be kidding!
 * (HINT #2: You can use a switch statement in the method using the random number,
 * that is generated, as your test Expression. The class does not have any attributes.)
 * 
 * Comments and style are worth up to 2 points.
 * 
 * Example output:
 * Welcome! My name is Madame Ruby the Fortune Teller!
 * Please ask me a Yes or No question. Type Goodbye to exit.
 * Will I get lots of presents for my birthday? <user hits enter>
 * Signs point to yes.
 * Please ask me another Yes or No question. Type Goodbye to exit.
 * Will I win the lottery? <user hits enter>
 * Don't count on it.
 * Please ask me another Yes or No question. Type Goodbye to exit.
 * Goodbye
 * Goodbye!
 * 
 * (HINT #3: When you read in the user's question, use string comparison method to 
 * figure out if they entered Goodbye. Make it so it doesn't matter if they type 
 * GOODBYE, goodbye, Goodbye...etc. -compare the strings but ignore case)
 * 
 * 
 * @author Maureen OMalley
 */

/**
 * This program demonstrates the use of the FortuneTeller class.
 * @author Maureen OMalley
 */
public class Question2 {

    public static void main(String[] args) {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in); 
        
        // Create a FortuneTeller object
        FortuneTeller f = new FortuneTeller();
        
        // Display menu message and get user input
        System.out.print("Welcome! My name is Madame Ruby the Fortune Teller!\n"
                 + "Please ask me a Yes or No question. Type Goodbye to exit.\n");
        String input = keyboard.nextLine();
        
        // While the user's input does not equal a case-insensitive "goodbye",
        // the program will give a fortune and ask for another question.
        // Once the user enters "goodbye", Madame Ruby will say goodbye and
        // the program will exit.
        while (!input.equalsIgnoreCase("Goodbye")) {
            System.out.println(f.readFortune());        
            System.out.println("Please ask me another Yes or No question. Type "
                    + "Goodbye to exit.");
            input = keyboard.nextLine();
        }
        System.out.println("Goodbye!");
    }
    
}