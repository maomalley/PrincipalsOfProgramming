package edu.carrollcc.cis132;

/**
 * HisHims Candy Manufacturing Plant [25 points].
 *
 * Design a class for a HisHims candy manufacturing plant in the
 * edu.carrollcc.cis132.q1 package. The class should have 2 fields: one to hold 
 * the number of candy bars that can be produced in an hour and another to hold 
 * the number of hours the plant is operating per day. The fields should be numeric.
 * Create accessors and mutators for these fields.
 * 
 * The class should also have an instance method that takes the number of desired
 * candy bars and returns the number of days it will take to produce them.
 *
 * Demonstrate the class by writing a program in the Question1 main method that
 * uses Dialog boxes to ask the user how many candy bars can be produced in an hour. 
 * It then should ask how many hours the plant operates every day.  
 * Create an instance of your class using this data.
 * 
 * Using Dialog boxes, ask the user how many candy bars they would like to produce.
 * Using the instance of the class, display, in a dialog box, the number of days 
 * the plant will take to produce the candy bars. Make sure your numeric output
 * contains comma delimiters.
 * 
 * Style is worth up to 2 points.
 *
 * Example output (Using Dialog Boxes)
 * ----------------
 * How many candy bars can be produced in an hour?
 * 100
 * How many hours is the plant operating per day?
 * 16
 * How many candy bars would you like to make?
 * 2,000,000
 * The plant will take 1,250 days to produce 2,000,000 HisHims Candy Bars.
 * ----------------
 * 
 * @author Maureen OMalley
 */
/**
 * Import for dialog boxes
 */
import javax.swing.JOptionPane;
import edu.carrollcc.cis132.q1.CandyBar;

/**
 * This class demonstrates the use of the class CandyBar.
 */
public class Question1 
{
    public static void main(String[] args) 
    {   
        /**
         * Create a CandyBar object
         */
        CandyBar c = new CandyBar();
        
        /**
         * To hold input
         */
        String inputString;
        
        /**
         * Get the number of candy produced
         */
        inputString = JOptionPane.showInputDialog("How many candy bars can be "
                + "produced in an hour?");
        /**
         * Convert the input to an integer
         */
        c.setCndyP(Integer.parseInt(inputString));
        
        /**
         * Get the number of hours operated
         */
        inputString = JOptionPane.showInputDialog("How many hours is the plant "
                + "operating per day?");
        /**
         * Convert the input to an integer
         */
        c.setHrsO(Integer.parseInt(inputString));
                
        /**
         * Get the number of candy bars desired
         */
        inputString = JOptionPane.showInputDialog("How many candy bars would "
                + "you like to make?");
        /**
         * Convert the input to an integer
         */
        c.setCndyAmnt(Integer.parseInt(inputString));
        
        /**
         * Show a message that indicates how many days the plant will take to
         * produce the desired amount of candy bars
         */
        JOptionPane.showMessageDialog(null, String.format("The plant will "
                + "take %,.2f days to produce %,d HisHims Candy Bars.", 
                c.getDays(), c.getCndyAmnt()));
        
        /**
         * End the program
         */
        System.exit(0);
    }   
}
