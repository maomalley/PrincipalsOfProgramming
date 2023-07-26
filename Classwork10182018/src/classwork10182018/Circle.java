/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork10182018;

/**
 *
 * @author S226_Inst
 */
public class Circle {
    private double radius;
    
    //no-arg constructor
    public Circle()
    {
        radius = 0.0;
    }
    
    //1-arg constructor
    public Circle(double r)
    {
        radius = r;
    }
    
    //copy constructor
    public Circle(Circle c)
    {
        this.radius = c.radius;
    }
    
    //toString method
    public String toString()
    {
        String outString = "The radius is: " + radius;
        return outString;
    }
    
    //equals method to compare objects
    public boolean equals(Circle c)
    {
        if (this.radius == c.radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //copy method
    public Circle copy()
    {
            //create a new object with the calling object's radius/attribute
            Circle copyCircle = new Circle(this.radius);
            return copyCircle;
    }
    
    
    
}
