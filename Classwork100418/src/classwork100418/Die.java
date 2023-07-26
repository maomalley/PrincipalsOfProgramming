/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork100418;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maureen OMalley
 */
public class Die {
    public static void main(String[] args)
    {
        int compGames = 0; //The number of games computer wins
        int userGames = 0; // The number of games user wins
        int tiedGames = 0; // The number of tied games        
        
        //Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);     

        System.out.println("Enter 1 to play or -1 to quit");
        int answer = keyboard.nextInt();
        
        Random rand = new Random();
        
        while(answer != -1)
        {
            int userRoll = rand.nextInt(6) + 1;
            System.out.println("You rolled " + userRoll);
            
            int compRoll = rand.nextInt(6) + 1;
            System.out.println("The computer rolled " + compRoll);
            //System.out.println("Enter 1 to play or -1 to quit");
            
            if (userRoll > compRoll)
            {
                System.out.println("User Won!\n");
                userGames++; //postfix increment
            } else if (compRoll > userRoll)
            {
                System.out.println("Computer Won\n");
                compGames++;
            } else
            {
                System.out.println("TIE");
                tiedGames++;
            }
            
            System.out.println("Enter 1 to play or -1 to quit");
            answer = keyboard.nextInt();
        }
        
        System.out.printf("Computer won %d times!\n", compGames);
        System.out.printf("User won %d times!\n", userGames);
        System.out.printf("There were %d tied games\n", tiedGames);
    }
        
}
