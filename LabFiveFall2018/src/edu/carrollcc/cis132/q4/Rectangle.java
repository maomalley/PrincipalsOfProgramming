/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carrollcc.cis132.q4;

/**
 *
 * @author Maureen OMalley
 */
public class Rectangle {
    private int numWidth;       // To hold the shape width
    private int numLength;      // To hold the shape length
    private char drawCharacter; // To hold the shape's character
    
    /**
     * Constructor accepts 3 parameters representing shape width, shape length,
     * and the character to draw the shape with
     * @param width integer representing the shape width
     * @param length integer representing the shape length
     * @param drawChar character representing the shape outline
     */
    public Rectangle(int width, int length, char drawChar){
        numWidth = width;
        numLength = length;
        drawCharacter = drawChar;
    }
    
    //Getters
    public int getWidth(){
        return numWidth;
    }
    
    public int getLength(){
        return numLength;
    }
    
    public char getChar(){
        return drawCharacter;
    }
    
    //Setters
    public void setWidth(int width){
        numWidth = width;
    }
    
    public void setLength(int length){
        numLength = length;
    }
    
    public void setChar(char drawChar){
        drawCharacter = drawChar;
    }
    
    /**
     * The printOutline method uses nested for loops to create the shape.
     * The nested for loop contains an if statement that determines if a 
     * character or a space should be displayed.
     */
    public void printOutline(){
        for(int j = 1; j <= numLength; j++)
          {  
            for(int i = 1; i <= numWidth; i++)
            {
              if(j == 1 || j == numLength || i == 1 || i == numWidth)  
              {
                System.out.print(drawCharacter);
              }
              else
              {
                   System.out.print(" ");
              }
            }
             System.out.println();
          } 
         }
}
