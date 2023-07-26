
package edu.carrollcc.cis132;

import java.util.Scanner;   //Needed for the Scanner class

/**
 * Question 1 [10 Points]
 * ZFinity Remote Control 
 * (Does not require a separate class)
 * 
 * Write a program that displays a menu and prompts the user to enter a channel 
 * number within the range of 1 through 10.  The program should display a channel 
 * name for that number.  If the number is outside the range of 1-10, the program should
 * display an error message. You should use a "Switch Statement" to solve this problem.
 * 
 * Example Output 1:
 * Welcome to ZFinity Remote Control
 * 1 = "HBO"
 * 2 = "Showtime"
 * 3 = "Cinemax"
 * 4 = "ESPN"
 * 5 = "Discovery Channel"
 * 6 = "Disney Channel"
 * 7 = "Cartoon Network"
 * 8 = "Animal Planet"
 * 9 = "BET"
 * 10 = "AMC"
 * What channel do you want to watch (enter 1-10)?
 * 5
 * You are now watching Discovery Channel.
 * 
 * Example Output 2:
 * Welcome to ZFinity Remote Control
 * 1 = "HBO"
 * 2 = "Showtime"
 * 3 = "Cinemax"
 * 4 = "ESPN"
 * 5 = "Discovery Channel"
 * 6 = "Disney Channel"
 * 7 = "Cartoon Network"
 * 8 = "Animal Planet"
 * 9 = "BET"
 * 10 = "AMC"
 * What channel do you want to watch (enter 1-10)?
 * 11
 * Your ZFinity channel line-up does not include that channel.
 * 
 * 
 * Comments and style are worth up to 2 points.
 * 
 * @author Maureen OMalley
 */

/**
 * This program displays a menu and prompts the user to enter a channel
 * number within the range of 1 through 10.
 */
public class Question1 {
    public static void main(String[] args)
    {
        int choice;     //To hold the user's channel number choice
        
        //Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);
        
        //Display the channels available and
        //ask the user to enter a channel number from 1-10.
        System.out.print("Welcome to ZFinity Remote Control\n"
                + "1 = \"HBO\"\n" + "2 = \"Showtime\"\n" + "3 = \"Cinemax\"\n"
                + "4 = \"ESPN\"\n" + "5 = \"Discovery Channel\"\n"
                + "6 = \"Disney Channel\"\n" + "7 = \"Cartoon Network\"\n"
                + "8 = \"Animal Planet\"\n" + "9 = \"BET\"\n" 
                + "10 = \"AMC\"\n" 
                + "What channel do you want to watch (enter 1-10)?\n");
        choice = keyboard.nextInt();
        
        //Determine which channel the user requested.
        switch (choice)
        {
            case 1:
                System.out.println("You are now watching HBO.");
                break;
            case 2:
                System.out.println("You are now watching Showtime.");
                break;
            case 3:
                System.out.println("You are now watching Cinemax.");
                break;
            case 4:
                System.out.println("You are now watching ESPN.");
                break;
            case 5:
                System.out.println("You are now watching Discovery Channel.");
                break;
            case 6:
                System.out.println("You are now watching Disney Channel.");
                break;
            case 7:
                System.out.println("You are now watching Cartoon Network.");
                break;
            case 8:
                System.out.println("You are now watching Animal Planet.");
                break;
            case 9:
                System.out.println("You are now watching BET.");
                break;
            case 10:
                System.out.println("You are now watching AMC.");
                break;
            default:
                System.out.println("Your ZFinity channel line-up does not "
                        + "include that channel.");
                break;
        }
    }
}
