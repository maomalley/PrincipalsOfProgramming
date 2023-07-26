/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printwriterdemo;
import java.io.*; //import the PrintWriter API
import java.util.Scanner;

/**
 *
 * @author S226_Inst
 */
public class PrintWriterDemo {

    /**
     * @param args the command line arguments
     */
    //must throw IOException in method header when using PrintWriter
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = keyboard.nextLine();
        //Create the PrintWriter object to open the file for writing
        PrintWriter outputFile = new PrintWriter(filename);
        
        //Do some writing to the file
        outputFile.println("Will"); //puts a newline character at end
        outputFile.println("Kelsea");
        outputFile.println("Nick");
        outputFile.print("Kywri "); //puts text without newline
        outputFile.print("Brennan ");
        outputFile.print("Gabe ");
        outputFile.print("1 ");
        outputFile.print("2 ");
        outputFile.print("3 ");
        outputFile.println(4);
        
        //calling our method writeFile that we declared below
        //this demonstrated need for throws IOException clause in the method header
        //of both the method and the calling method (main)
        writeFile();
       
        outputFile.close(); //Have to close the file
        
        //Since we closed the file, we need to open it and re-establish the connection
        //We want to append text to our file.
        //Open the file we got from the user above and append data
        //Use the FileWriter object to accomplish this 'true' means we are appending
        FileWriter fw = new FileWriter(filename, true);
        
        //Now create the PrintWriter object passing the FileWriter object as parameter
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println("Holly");
        pw.println("Greg");
        pw.println("Robert");
        
        pw.close();
       
        //Create a new file and give the PrintWriter a directory
        //First create the file name string using UNIX style forward slash
        //because Java will make it Windows style backslashes
        //if this directory does not exist, there will be a Runtime error
        //Make sure you have created the directory
        String fName = "C:/class132/names.txt";
        PrintWriter outFile = new PrintWriter(fName);
        outFile.println("Eric");
        outFile.println("Cynthia");
        outFile.println("Sarah");
        outFile.close(); //close the PrintWriter file
        
        //re-open the file for appending
        //fName variable was set above to the directory/file name
        FileWriter fileW = new FileWriter(fName, true);
        //Pass the FileWriter object to PrintWriter
        PrintWriter printW = new PrintWriter(fileW);
        printW.println("Brennan");
        printW.println("Stephen");
        printW.println("Maureen");
        printW.close(); //Close the file
        
    }
    
//must throw IOException in method header when using PrintWriter
    public static void writeFile() throws IOException {
        //This line will overwrite "test.txt" file everytime
        PrintWriter outputFile2 = new PrintWriter("test.txt");
        outputFile2.println("Hello ");
        outputFile2.close(); //Must close the file
    }
    
}
