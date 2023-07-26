/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Maureen
 */
public class TrueFalse {
    public static void main(String[] args) throws IOException
    { 
        Scanner keyboard = new Scanner(System.in);
        // Display welcome message and ask for a file name
        System.out.println("Welcome to the File Maker!");
        System.out.println("Type a source file name[ex. test.txt]:");
        // Store the file name
        String fileName = keyboard.nextLine();
        
        // Ask the user where the file should be written
        System.out.println("Where would you like the file written?");
        // Store the write file
        String writeFile = keyboard.nextLine();        
        
        // Ask the user to choose from menu options
        System.out.print("Choose an option:\n1. Vowel Free file\n"
                + "2. Excitified file\n3. Uppercase file\n"
                + "4. Exit the program\n");
        int choice = keyboard.nextInt();
        
        switch (choice) {
            case 1:
                
                File text = new File(fileName);
                Scanner inputFile = new Scanner(text);   
                
                while(inputFile.hasNext()) {
                    String readLine = inputFile.nextLine();

                    readLine.charAt(0);
                    int x = 0;
                    int len = readLine.length();

                    PrintWriter outputFile = new PrintWriter(writeFile);

                    while (x < len) {
                        //do something with this character
                        char a = readLine.charAt(x);

                        if(a == 'a' || a == 'A' ||
                                a == 'e' || a == 'E' ||
                                a == 'i' || a == 'I' ||
                                a == 'o' || a == 'O' ||
                                a == 'u' || a == 'U'){
                            a = ' ';

                            outputFile.print(a);
                            
                            inputFile.close();

                            x++;
                        } else{
                             outputFile.print(a);
                            x++;
                        }     

                }
                    
                    outputFile.close();
                }                
                
                System.out.println("Data written to file.");
                break;
            case 2:
                //outputFile.println(f.excitify(fileName));
                System.out.println("Data written to file.");
                break;
            case 3:
                //outputFile.println(f.uppercasify(fileName));
                System.out.println("Data written to file.");
                break;
            default:
                System.out.println("Goodbye!");
                break;
        }        
        
    }
}
