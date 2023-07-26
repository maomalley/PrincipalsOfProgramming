/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S226_Inst
 */
//This class represents a Rectangle. It has public access modifier so that it 
//can be used by anyone that has access to this class
public class Rectangle {
    private double length; //this attribute/field contains the length
    private double width;  //this attribute/field contains the width
    
    /**
     * The setLength method accepts an argument that is stored in the length field
     */
    
    //MUTATOR - Setter
    public void setLength(double len) //method header
    {
        length = len;               // method body
    }
    
    /**
     * The setWidth method accepts an argument that is stored in the width field
     */
    
    //MUTATOR - Setter
    public void setWidth(double w) //method header
    {
        width = w;                  //method body
    }
    
    /**
     * The getLength method returns the value of the length field as a double
     */
    
    //ACCESSOR - Getter
    public double getLength() //method header
    {
        return length;  //return statement
    }
    
    /**
     * The getWidth method returns the value of the width field as a double
     */
    
    //ACCESSOR - Getter    
    public double getWidth() //method header
    {
        return width;
    }
    
    /** 
     * The getArea method returns the value of the length field times the width field
     */
    
    //Member Method
    public double getArea() //method header
    {
        double area;
        area = length * width;
        return area;
    }
    
    /** 
     * The getPerimeter method returns the value of 2 times width field plus
     * 2 times the length field
     */
    
    //Member Method
    public double getPerimeter() //method header
    {
        double perimeter;
        perimeter = (2 * width) + (2 * length);
        return perimeter;
    }
   
}
