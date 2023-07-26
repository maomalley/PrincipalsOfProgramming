/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork100418;

import java.util.Scanner;
import classwork100418.Rectangle;

/**
 *
 * @author Maureen OMalley
 * @author Robert Dixon
 */
public class Main {
    public static void main(String []args)
    {
        //Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the width? ");
        int numWidth = keyboard.nextInt();
        
        System.out.println("What is the length? ");
        int numLength = keyboard.nextInt();        
        
        //Call the constructor
        Rectangle shape = new Rectangle(numWidth, numLength);
        
        shape.printRectangle();
    }
}
