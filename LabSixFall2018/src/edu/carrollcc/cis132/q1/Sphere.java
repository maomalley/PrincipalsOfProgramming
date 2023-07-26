package edu.carrollcc.cis132.q1;

/**
 * This class holds methods that do different things with a sphere radius.
 *
 * @author Maureen
 */
public class Sphere {

    private double radius;

    /**
     * No-argument constructor sets attributes to 0.
     */
    public Sphere() {
        radius = 0.0;
    }

    /**
     * One-argument constructor sets each attribute to the argument passed in.
     *
     * @param radius double representing sphere radius.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Copy constructor accepts an object of same type as parameter.
     *
     * @param s Sphere copy constructor
     */
    public Sphere(Sphere s) {
        this.radius = s.radius;
    }

    /**
     * calcVolume() method calls the ShapeCalc class calcVolume method for
     * spheres.
     *
     * @return double representing sphere volume.
     */
    public double calcVolume() {
        return ShapeCalc.calcVolume(radius);
    }

    /**
     * toString() method prints the dimensions of the sphere.
     *
     * @return String that contains the radius of the sphere
     */
    public String toString() {
        String outString = "Radius: " + radius;
        return outString;
    }

    /**
     * equals method compares two shapes to see if they are equal based off
     * their dimensions.
     *
     * @param s Sphere copy constructor
     * @return boolean value true if they are equal or boolean value false if
     * not
     */
    public boolean equals(Sphere s) {
        if (this.radius == s.radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * compareTo method takes class object as argument and determines which
     * shape is larger.
     *
     * @param s Sphere copy constructor
     * @return if the calling object is smaller in volume than argument object,
     * 0 if the calling object is the same in volume as argument object, or 1 if
     * the calling object is larger in volume than argument object
     */
    public int compareTo(Sphere s) {
        double val = ShapeCalc.calcVolume(radius);
        double val2 = ShapeCalc.calcVolume(s.radius);

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

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
