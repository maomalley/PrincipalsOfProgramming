package edu.carrollcc.cis132;

/**
 * Question 3 [10 points].
 * Correct the following program to show the calculated total pay without
 * changing the print statement.
 * 
 * @author Maureen OMalley
 */
public class Question3 {

    public static void main(String[] args) 
    {        
        short totalPay = 0, basePay = 580, overTime = 285, bonus = 1000;
        
        //TODO: Uncomment and correct the following line to calculate total pay
        totalPay = (short) (basePay + overTime + bonus);
        
        //Don't change this statement
        System.out.printf("The total pay is $%,.2f. \n", (double)totalPay);
    }
    
}
