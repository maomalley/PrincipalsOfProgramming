package edu.carrollcc.cis132.q1;

/**
 * This class holds the formulas to calculate sphere, box, and cylinder volumes
 * in three overloaded static methods.
 * @author Maureen OMalley
 */
public class ShapeCalc {
    
    private double radius;  // to hold the radius
    private double height;  // to hold the height
    private double width;   // to hold the width
    private double depth;   // to hold the depth
    
    /**
     * Overloaded method to calculate the volume of a sphere.
     * @param radius double representing the sphere's radius.
     * @return double volume representing sphere volume.
     */
    public static double calcVolume(double radius) {
       double volume = (double)(4.0/3.0) * (double)(Math.PI * radius * radius * radius);
       return volume;
    }
    
    /**
     * Overloaded method to calculate the volume of a box.
     * @param width double representing box width.
     * @param height double representing box height.
     * @param depth double representing box depth.
     * @return double volume representing the box volume.
     */
    public static double calcVolume(double width, double height, double depth) {
        double volume = width * height * depth;
        return volume;
    }
    
    /**
     * Overloaded method to calculate the volume of a cylinder.
     * @param radius double representing cylinder radius.
     * @param height double representing cylinder height.
     * @return double volume representing cylinder volume.
     */
    public static double calcVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
}
