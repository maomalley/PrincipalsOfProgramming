/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Methods.SmallestOfThreeNumbers;
import java.util.Scanner;

/**
 *
 * @author Maureen OMalley
 */
public class MainSmallestOfThreeNumbers {
    public static void main(String[] args){
        int userNum1;
        int userNum2;
        int userNum3;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        userNum1 = keyboard.nextInt();
        
        System.out.println("Please enter your second number: ");
        userNum2 = keyboard.nextInt();
        
        System.out.println("Please enter your third number: ");
        userNum3 = keyboard.nextInt();
        
        SmallestOfThreeNumbers s = new SmallestOfThreeNumbers(userNum1, 
                                                    userNum2, userNum3);
    }
}
