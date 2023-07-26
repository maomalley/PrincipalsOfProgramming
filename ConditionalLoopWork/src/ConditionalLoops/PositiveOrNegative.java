package ConditionalLoops;

import java.util.Scanner;   // Needed for user input

/**
 * This program asks the user to enter a number and tells them whether it is
 * positive or negative.
 *
 * @author Maureen OMalley
 */
public class PositiveOrNegative {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        double userNumber; // field to hold user number

        // Get and store the user number
        System.out.println("What number would you like to test?");
        userNumber = keyboard.nextDouble();

        // Display a positive number message is number is above 0,
        // diplay that the user entered 0 if the number is 0,
        // or display that the user entered a negative number.
        if (userNumber > 0) {
            System.out.println("You entered a positive number.");
        } else if (userNumber == 0) {
            System.out.println("You entered 0.");
        } else {
            System.out.println("You entered a negative number.");
        }
    }

}
