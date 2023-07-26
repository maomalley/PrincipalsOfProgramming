/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork10182018;
/**
 * This program creates a FullName object, and then calls the  
 * object's getLength method before values are established for 
 * its reference fields. As a result, this program will crash.
 */

public class NameTester
{
   public static void main(String[] args)
   {
      // Create a FullName object.
      FullName name = new FullName();
      
      // Display the length of the name.
      System.out.println(name.getLength());
   }
}
