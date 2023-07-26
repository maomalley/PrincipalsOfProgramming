package edu.carrollcc.cis132.q1;

/**
 * This class holds methods that do different things with cylinder dimensions.
 *
 * @author Maureen
 */
public class Cylinder {

    private double radius;
    private double height;

    /**
     * No-argument constructor sets attributes to 0.
     */
    public Cylinder() {
        radius = 0.0;
        height = 0.0;
    }

    /**
     * Multiple-argument constructor sets each attribute to the argument passed
     * in.
     *
     * @param radius double representing cylinder radius.
     * @param height double representing cylinder height.
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Copy constructor accepts an object of same type as parameter.
     *
     * @param c Cylinder copy constructor
     */
    public Cylinder(Cylinder c) {
        this.radius = c.radius;
        this.height = c.height;
    }

    /**
     * calcVolume() method calls the ShapeCalc class calcVolume method for
     * cylinders.
     *
     * @return double representing cylinder volume.
     */
    public double calcVolume() {
        return ShapeCalc.calcVolume(radius, height);
    }

    /**
     * toString() method prints the dimensions of the cylinder on two lines.
     *
     * @return string containing the cylinder radius and height.
     */
    public String toString() {
        String outString = "Radius: " + radius + "\nHeight: " + height;
        return outString;
    }

    public boolean equals(Cylinder c) {
        if (this.radius == c.radius && this.radius == c.height) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * compareTo method takes class object as argument and determines which
     * shape is larger.
     *
     * @param c Cylinder copy constructor
     * @return -1 if the calling object is smaller in volume than argument
     * object, 0 if the calling object is the same in volume as argument object,
     * or 1 if the calling object is larger in volume than argument object
     */
    public int compareTo(Cylinder c) {
        double val = ShapeCalc.calcVolume(radius, height);
        double val2 = ShapeCalc.calcVolume(c.radius, c.height);

        if (val < val2) {
            return -1;
        } else if (val == val2) {
            return 0;
        } else {
            return 1;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
