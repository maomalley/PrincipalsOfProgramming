/*
 * This program demonstrates the Rectangle Class's methods
 */

/**
 *
 * @author S226_Inst
 */
public class LengthDemo {
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();
        
        System.out.println("Sending the value 10.0 to the setLength method");
        double length = 10.0;
        box.setLength(length);
        box.setWidth(20.0);
        
        System.out.println("Done");
        
        //get the length of the Rectangle object called "box"
        double boxLen;
        double boxWid;
        boxLen = box.getLength();
        boxWid = box.getWidth();
        
        System.out.println("My box length is: " + boxLen);
        System.out.println("My box width is: " + boxWid);
        
        //calculate area
        double boxArea = boxLen * boxWid;
        
        System.out.println("My box area is: " + boxArea);
        
        //Call the member method of Rectangle class to calculate Area
        
        boxArea = box.getArea(); //do not need to declare a new variable, can reuse it
        
        System.out.println("My box area as calculated in the class is: " + boxArea);
        
        //calculate perimeter using the member method in the Rectangle class
        double boxPerimeter = box.getPerimeter();
        
        System.out.println("My box perimeter as calculated in the class is: " + boxPerimeter);
        
        //change the box size because it needs to be bigger
        
        box.setLength(30.0); //set the new length to 30
        box.setWidth(40.0); //set the new width to 40
        
        //our new area is
        System.out.println("My bigger box area is: " + box.getArea());
        //our new perimeter is
        System.out.println("My bigger box perimeter is: " + box.getPerimeter());
        
        
        
    }
}
