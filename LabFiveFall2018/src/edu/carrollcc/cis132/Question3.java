package edu.carrollcc.cis132;

import edu.carrollcc.cis132.q3.FileMaker;   // Needed for the FileMaker class
import java.io.*;                   // Needed for PrintWriter API
import java.util.Scanner;           // Needed for the Scanner class

/**
 * Question 3 [25 Points] FileMaker Class.
 *
 * Write a class named FileMaker in the edu.carrollcc.cis132.q3 package. The
 * class's constructor should accept a source file name String as an argument.
 * INPUT
 *
 * The class should have at least the following 3 methods: OUTPUT 1.
 * removeVowels - takes a destination file name String as the argument. Creates
 * or overwrites the destination file with the contents of the source file minus
 * the vowels (aeiou).
 *
 * 2. excitify - takes a destination file name String as the argument. Creates
 * or overwrites the destination file with the contents of the source file with
 * each "." replaced with "!".
 *
 * 3. uppercasify - takes a destination file name String as the argument.
 * Creates or overwrites the destination file with an uppercase version of the
 * file.
 *
 * Demonstrate the class in the Question3 main method by asking the user for the
 * name of a file to read from. Then ask the user to choose from a menu of the
 * three output options. If the user enters an invalid option, the menu should
 * be displayed over again until they enter a valid option. Then ask for the
 * name of a file to write to. Be sure to close your file! Construct a FileMaker
 * object and generate the type of file chosen by the user. Create your own
 * input files to test the program.
 *
 *
 * Comments and style are worth up to 2 points.
 *
 * Example output 1: Welcome to the File Maker! Type a source file name[ex.
 * test.txt]: test.txt //user input Choose an option: 1. Vowel Free file 2.
 * Excitified file 3. Uppercase file 4. Exit the program
 *
 * 5 //user input That is not a valid option, please choose an option: 1. Vowel
 * Free file 2. Excitified file 3. Uppercase file 4. Exit the program
 *
 * 3 //user input Where would you like the file written? uppercase.txt //user
 * input Your file has been Uppercasified! Enjoy!
 *
 * Example output 2: Welcome to the File Maker! Type a source file name[ex.
 * test.txt]: test.txt //user input Choose an option: 1. Vowel Free file 2.
 * Excitified file 3. Uppercase file 4. Exit the program
 *
 * 4 //user input Goodbye!
 *
 *
 * Example input file contents: test.txt No more rhyming now, and I mean it.
 * Anybody want a peanut? Have fun storming the castle. You are in the pit of
 * despair.
 *
 * Example output file contents: (Vowel Free file) N mr rhymng nw, nd mn t.
 * nybody wnt pnt? Hv fn strmng th cstl. Y r n th pt f dspr.
 *
 * Example output file contents: (Uppercasified) NO MORE RHYMING NOW, AND I MEAN
 * IT. ANYBODY WANT A PEANUT? HAVE FUN STORMING THE CASTLE. YOU ARE IN THE PIT
 * OF DESPAIR.
 *
 * Example output file contents: (Excitified) No more rhyming now, and I mean
 * it! Anybody want a peanut? Have fun storming the castle! You are in the pit
 * of despair!
 *
 *
 * @author Maureen OMalley
 */
/**
 * This class demonstrates the use of the FileMaker class.
 */
public class Question3 {

    public static void main(String[] args) throws IOException {
        // Create Scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        // Display welcome message and ask for an input file name
        System.out.println("Welcome to the File Maker!");
        System.out.println("Type a source file name[ex. test.txt]:");
        // Store the input file name
        String fileName = keyboard.nextLine();

        // Ask the user to choose from menu options
        System.out.print("Choose an option:\n1. Vowel Free file\n"
                + "2. Excitified file\n3. Uppercase file\n"
                + "4. Exit the program\n");
        int choice = keyboard.nextInt();

        //Consume end of line character
        keyboard.nextLine();

        while (choice < 0 || choice >= 5) {
            System.out.println("That is not a valid option, please choose an option:");
            System.out.print("Choose an option:\n1. Vowel Free file\n"
                    + "2. Excitified file\n3. Uppercase file\n"
                    + "4. Exit the program\n");
            choice = keyboard.nextInt();
        }

        // Ask the user where the file should be written
        System.out.println("Where would you like the file written?[ex. new.txt]");
        // Store the write file
        String writeFile = keyboard.nextLine();

        // Create a FileMaker object
        FileMaker f = new FileMaker(fileName);

        // Return a file depending on user's choice
        switch (choice) {
            case 1:
                f.removeVowels(writeFile);
                System.out.println("Your file is now vowel free. Enjoy!");
                break;
            case 2:
                f.excitify(writeFile);
                System.out.println("Your file has been Excitified! Enjoy!");
                break;
            case 3:
                f.uppercasify(writeFile);
                System.out.println("Your file has been Uppercasified! Enjoy!");
                break;
            default:
                System.out.println("Goodbye!");
                break;
        }

    }

}
