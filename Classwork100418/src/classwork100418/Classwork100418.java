/**
 * This program will accumulate points scored in a soccer game
 */
package classwork100418;

import java.util.Scanner;

/**
 *
 * @author Maureen OMalley
 */
public class Classwork100418 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int points,     //game points
                totalPoints = 0;    //Accumulator
        
        //Create Scanner for input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the points for your team");
        System.out.println("that you have earned for each game this season.");
        System.out.println("Enter -1 when you are finished.");
        
        //Get the first number of points
        System.out.print("Enter game points or -1 to end.");
        points = keyboard.nextInt();
        
        //Accumulate points until the -1 is entered
        
        while(points != -1) //-1 is the sentinel value
        {
            //Add the points to the running total
            totalPoints += points;
            
            //Get the next number of points
            System.out.print("Enter game points or -1 to end.");
            points = keyboard.nextInt();
        }
        
        //Display the total number of points
        System.out.println("The total points are " + totalPoints);
        
        
    }
    
}
