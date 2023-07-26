package ConditionalLoops;

import java.util.Scanner;

/**
 * This program prints the amount of natural numbers the user wants using a loop.
 * @author Maureen OMalley
 */
public class TenNaturalNumbers {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int loopNumbers;
        int firstNumber = 1;
        
        System.out.println("How many natural numbers would you like (1-10)?");
        loopNumbers = keyboard.nextInt();
        
        while (loopNumbers <= 0 || loopNumbers >= 11){
            System.out.println("Error: Please enter a number in the range of 1-10");
            
            System.out.println("How many natural numbers would you like (1-10)?");
            loopNumbers = keyboard.nextInt();        
        }
        
        System.out.println("The natural numbers are:");
        
        while (loopNumbers >= 1 && loopNumbers <= 10) {
            System.out.println(firstNumber);
            firstNumber++;
            loopNumbers--;
        }
    }
}
