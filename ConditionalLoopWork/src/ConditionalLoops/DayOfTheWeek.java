package ConditionalLoops;

import java.util.Scanner;   // Needed to read user input

/**
 * This program accepts a number between 1 and 8, then displays the day of the
 * week. If the user enters a number outside the range of 1-7, it will loop
 * until they enter valid input.
 *
 * @author Maureen OMalley
 */
public class DayOfTheWeek {

    public static void main(String[] args) {
        int weekDay;    //field to hold the user's day of the week

        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Get and store a number between 1 and 7
        System.out.println("Please enter a number between 1 and 7:");
        weekDay = keyboard.nextInt();

        // Input Validation: Loop until user enters a number between 1 and 7
        while (weekDay <= 0 || weekDay >= 8) {
            System.out.println("ERROR: Please enter a number between 1 and 7:");
            weekDay = keyboard.nextInt();
        }
        
        // Switch statement to display a day of the week depending on weekDay
        switch (weekDay) {
            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is Wednesday.");
                break;
            case 4:
                System.out.println("Today is Thursday.");
                break;
            case 5:
                System.out.println("Today is Friday.");
                break;
            case 6:
                System.out.println("Today is Saturday.");
                break;
            case 7:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("A number between 1 and 7 was not entered.");
                break;
        }
    }
}
