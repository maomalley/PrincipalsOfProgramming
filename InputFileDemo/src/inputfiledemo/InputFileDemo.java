/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputfiledemo;

import java.io.*; //import for files
import java.util.Scanner;

/**
 *
 * @author S226_Inst
 */
public class InputFileDemo {

    /**
     * @param args the command line arguments
     */
    //Since we are going to use input files, need to throw exception
    //Add throws IOException clause to method header
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Ask the user to enter filename from the keyboard
        //create Scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = keyboard.nextLine();

        //Now, we want to open file for reading
        //First, create the File object with the filename string
        //File must exist or will throw an error
        File inputFile = new File(filename);

        //Use the exists method of the File class to check if the file exists.
        if (!inputFile.exists()) {
            System.out.println("FILE " + filename + "DOES NOT EXIST");
        } else {

            //Next create a Scanner object to read the data from the file
            //passing the File object as its parameter for the constructor
            Scanner scanFile = new Scanner(inputFile);

            String name1;
            //If there is nothing left to read in the file, we will have an error
            //when we try to read it. SO, use hasNext() method to check if there is anything
            //before we read it. We do this in a While loop outside of our input reading
            while (scanFile.hasNext()) {

                //Use the scanner methods to read your inputfile.
                name1 = scanFile.nextLine();

                //Do something with the name we have read in
                if ((name1.equalsIgnoreCase("holly") || name1.equalsIgnoreCase("nick"))) {
                    System.out.println("IT IS A MATCH!!");
                }
                System.out.println("Read from the input file: ");
                System.out.println(name1);
            }

            //close the file - the Scanner object not the File object
            scanFile.close();
        }

        //Get another file and read it character by character
        System.out.print("enter a filename: ");
        String fName = keyboard.nextLine();
        //Now we create File object
        File inFile = new File(fName);

        //After we create file object, check if it exists
        if (!inFile.exists()) {
            System.out.println("FILE " + fName + "DOES NOT EXIST");
        } else {

            //Create the file reader/Scanner object using the File object
            Scanner inFileScan = new Scanner(inFile);

            //ALWAYS check if there is something to read in the file
            while (inFileScan.hasNext()) {
                String line = inFileScan.nextLine();
                int maxLength = line.length();
                int curCharIndex = 0;
                while (curCharIndex < maxLength) {
                    //do something with the current character char a = readLine.charAt(x);
                    char a = line.charAt(curCharIndex);
                    //Print the characters out on a separate line.
                    System.out.println(a);
                    curCharIndex++; //increment our index so we don't have infinite loop
                }

            }
            inFileScan.close(); //CLOSE THE FILE
        }

        //Let's read in a file from a different directory that is full of integers
        String fileNameInts = "C:/class132/numbers.txt";
        //Now create the File object
        File numFile = new File(fileNameInts);

        if (!numFile.exists()) {
            System.out.println("File " + fileNameInts + "Does not exist.");
        } else {

            //Now create the Scanner object to read the file
            Scanner scanNumFile = new Scanner(numFile);
            //ALWAYS check if there is something to read in the file
            while (scanNumFile.hasNext()) {
                int number = scanNumFile.nextInt();
                System.out.print(number + " ");
            }
            scanNumFile.close();
        }
    }

}
