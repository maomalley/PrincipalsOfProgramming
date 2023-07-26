/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork100418;

/**
 *
 * @author Maureen OMalley
 * @author Robert Dixon
 */
public class Rectangle {
    private int width;
    private int length;
    
    /**
     * Constructor
     */
    public Rectangle(int wid, int len){
        width = wid;
        length = len;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getLength(){
        return length;
    }
    
    public void setWidth(int wid){
        width = wid;
    }
    
    public void setLength(int len){
        length = len;
    }
    
    public int getArea(){
        int area = length * width;
        return area;
    }
    
    public void printRectangle(){
        
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < length; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
