/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carrollcc.cis132.q3;

import java.io.*;
import java.util.Scanner;   // Needed to use Scanner

/**
 *
 * @author Maureen OMalley
 */
public class FileMaker {

    private String file;    // Field to hold the fileName String

    /**
     * Constructor accepts a String representing the input file.
     *
     * @param userFile String representing the user's input file
     */
    public FileMaker(String userFile) {
        file = userFile;
    }

    /**
     * The removeVowels function finds all vowels in a file and only prints the
     * characters that are not a vowel.
     *
     * @param writeFile the new user-specified file that will not contain
     * vowels.
     * @throws IOException
     */
    public void removeVowels(String writeFile) throws IOException {

        File inputFile = new File(file);

        if (!inputFile.exists()) {
            System.out.println("FILE " + file + "DOES NOT EXIST");
        } else {
            Scanner scanFile = new Scanner(inputFile);

            PrintWriter pw = new PrintWriter(writeFile);

            while (scanFile.hasNext()) {
                String readLine = scanFile.nextLine();

                int x = 0;
                int len = readLine.length();

                while (x < len) {
                    //do something with this character
                    char a = readLine.charAt(x);

                    if (a == 'a' || a == 'A'
                            || a == 'e' || a == 'E'
                            || a == 'i' || a == 'I'
                            || a == 'o' || a == 'O'
                            || a == 'u' || a == 'U') {

                    } else {
                        pw.print(a);

                    }
                    x++;
                }
                pw.println();
            }
            scanFile.close();
            pw.close();
        }
    }

    /**
     * The excitify method finds all period characters in a file and replaces
     * them with exclamation points.
     *
     * @param writeFile the new user-specified file that will be excitified.
     * @throws IOException
     */
    public void excitify(String writeFile) throws IOException {

        File inputFile = new File(file);

        if (!inputFile.exists()) {
            System.out.println("FILE " + file + "DOES NOT EXIST");
        } else {

            Scanner scanFile = new Scanner(inputFile);

            FileWriter fw = new FileWriter(writeFile);
            PrintWriter pw = new PrintWriter(fw);

            while (scanFile.hasNext()) {
                String readLine = scanFile.nextLine();

                int x = 0;
                int len = readLine.length();

                while (x < len) {
                    //do something with this character
                    char a = readLine.charAt(x);

                    if (a == '.') {
                        pw.print('!');
                        x++;
                    } else {
                        pw.print(a);
                        x++;
                    }
                }
                pw.println();
            }
            scanFile.close();
            pw.close();
        }
    }

    /**
     * The uppercasify method takes all strings in a file and uses the
     * Scannner's toUpperCase method to make them upper case.
     *
     * @param writeFile the new user-specified file which will contain only
     * upper-case Strings.
     * @throws IOException
     */
    public void uppercasify(String writeFile) throws IOException {

        File inputFile = new File(file);

        if (!inputFile.exists()) {
            System.out.println("FILE " + file + "DOES NOT EXIST");
        } else {

            Scanner scanFile = new Scanner(inputFile);

            FileWriter fw = new FileWriter(writeFile);
            PrintWriter pw = new PrintWriter(fw);

            while (scanFile.hasNext()) {
                String readLine = scanFile.nextLine();

                pw.println(readLine.toUpperCase());
            }
            scanFile.close();
            pw.close();
        }
    }

}
