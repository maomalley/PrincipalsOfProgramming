
package edu.carrollcc.cis132;

/**
 * Question 2 [30 points]
 * ArrayTools Class
 * Opportunity for 6 BONUS points!!
 * 
 * You are tasked with writing an attendance program. A file of names called
 * "data/names.txt" is provided with the lab. You can see it under the 'Files' tab
 * Each name will appear on its own line.
 * The names are lastname_space_firstname. You don't have to worry about splitting them.
 * Just store them as they are.
 * In Question2.java, use the File and Scanner classes to read in the names and 
 * put them in an array. 
 * There will be 20 names. 
 * You should always check for the end of file though, while parsing your file. 
 * Once the names are loaded, use your selectionSort method to sort the names 
 * into alphabetical order. 
 * Don't forget to close your file! 
 * Don't forget throws IOException!
 * Feel free to write static methods in Question2.java to handle repetitive tasks.
 * Look for BONUS points to earn by doing this! You are the programmer! Figure 
 * out how to make your main method NEATER by breaking pieces out into methods!
 * Pass your arrays as arguments!
 * 
 * In Question2.java, you will also create a parallel array (another array of 
 * same length as student name array, to use along with it) that contains 
 * boolean values representing whether or not a student is present for class. 
 * Present = true, Absent = false. 
 * A menu option will allow the teacher (user) to "Take Attendance" and 
 * you will set the values in that array. 
 * It will just contain boolean true or false - no name strings.
 * 
 * Create an ArrayTools class in edu.carrollcc.cis132.q2 with the following methods:
 * 
 * 1. selectionSort - takes a String array as an argument/parameter and sorts it in 
 * alphabetical order (A-Z).
 * REMEMBER, when you pass an array as an argument, it is a reference to that array, not a copy.
 * Any changes you make to the array are happening to the original array you passed in.
 * You do not need to return an array reference. INGORE WHETHER UPPERCASE OR LOWERCASE
 * (HINT: Selection Sort for integers is in the book you have to convert it to handle Strings)
 * 
 * 2. sequentialSearch - takes a String and a String array as arguments/parameters.
 * Returns an integer representing the index where the String is located in the array. 
 * -1 if not located in the array. IGNORE WHETHER UPPERCASE OR LOWERCASE!
 * (HINT: Sequential Search for integers is in the book you have to convert it to handle Strings)
 * 
 * How the Program works:
 * A. At the beginning of the program, automatically read the names from "data/names.txt",
 * filling in your student names array with the values and then call selectionSort 
 * to sort the array.
 * 
 * B. Present a menu with the options: 
 *          1. Take Attendance 
 *          2. Check Student Attendance
 *          3. Display Class Attendance
 *          4. Exit Program
 *  **(BONUS [1 point] Write a static method in Question2 class that prints the menu,
 *  loops until valid input, and returns the choice)
 * 
 * C. Keep track, in a flag in the main method, of whether or not attendance has been taken yet.
 * 
 * D. If User selects 1:
 * 
 *      Loop through the array that contains the Student names and ask if present or absent. 
 *      You may use whatever input you choose to represent present or absent (0 or 1, Y or N, etc.)
 *      and use that value to set true or false in your attendance array.
 *      Be sure to set your flag that attendance was taken!
 * **(BONUS [2 points] Write a static method in Question2 class that does most
 *   of the above functionality for Task D)
 * 
 * E. If User selects 2, Check your flag to see if attendance has been taken.
 *      -If attendance has not been taken, tell the user they need to take attendance first.
 *          You may present the main menu again or ask if they want to take attendance now,
 *          it is up to you.
 *      -If attendance has already been taken, ask for a name to check. The full
 *          name should be entered lastname_space_firstname so it matches how it
 *          is stored in the array
 *          Using your sequentialSearch method, check if the student is registered 
 *              for the class.
 *          -If a valid index/subscript is returned, use that returned subscript 
 *              to access the boolean attendance array and display a message of 
 *              whether present or absent.
 *          - If -1 returned, tell the user that the student they entered is not
 *              registered for this class.
 * 
 * (HINT: Since the arrays are parallel, students[2] should contain the name
 * and attendance[2] should contain their attendance status, etc.)
 *
 *  **(BONUS [2 points] Write a static method in Question2 class that does most of
 * the above functionality for Task E)
 * 
 * F. If User selects 3, Check your flag to see if attendance has been taken.
 *      -If attendance has already been taken, display a table of all student names
 *          and their attendance status.
 *          Example Output:
 *          Name            Attendance
 *          --------------------------
 *          Armstrong Neil  Present
 *          Barker Bob      Present
 *          Black Jack      Absent
 *          Brown James     Present
 *          etc.
 * **(BONUS [1 point] Write a static method in Question2 class that does most of
 * the above functionality for Task F)
 *          
 * Comments and style are worth up to 2 points.
 * Include JAVADOC comments in your class explaining your methods
 * 
 * @author WRITE YOUR NAME
 */
public class Question2 {
    
}
