package edu.carrollcc.cis132.q1;

/**
 * This class holds methods that do different things with box dimensions.
 *
 * @author Maureen
 */
public class Box {

    private double height;
    private double width;
    private double depth;

    /**
     * No-argument constructor sets attributes to 0.
     */
    public Box() {
        height = 0.0;
        width = 0.0;
        depth = 0.0;
    }

    /**
     * Multiple-argument constructor sets each attribute to the argument passed
     * in.
     *
     * @param height double representing box height.
     * @param width double representing box width.
     * @param depth double representing box depth.
     */
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    /**
     * Copy constructor accepts an object of same type as parameter.
     *
     * @param b Box copy constructor
     */
    public Box(Box b) {
        this.height = b.height;
        this.width = b.width;
        this.depth = b.depth;
    }

    /**
     * calcVolume() method calls the ShapeCalc class calcVolume method for
     * boxes.
     *
     * @return double representing box volume.
     */
    public double calcVolume() {
        return ShapeCalc.calcVolume(height, width, depth);
    }

    /**
     * toString() method prints the dimensions of the box on three lines.
     *
     * @return String that contains the height, width, and depth of the box.
     */
    public String toString() {
        String outString = "Height: " + height + "\nWidth: " + width + "\n"
                + "Depth: " + depth;
        return outString;
    }

    /**
     * equals method compares two shapes to see if their dimensions are the
     * same.
     *
     * @param b Box copy constructor
     * @return boolean value true if dimensions are equal or false if not
     */
    public boolean equals(Box b) {
        if (this.height == b.height && this.width == b.width && this.depth == b.depth) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * compareTo method takes class object as argument and determines which
     * shape is larger.
     *
     * @param b Box copy constructor
     * @return -1 if the calling object is smaller in volume than argument
     * object, 0 if the calling object is the same in volume as argument object,
     * or 1 if the calling object is larger in volume than argument object
     */
    public int compareTo(Box b) {
        double val = ShapeCalc.calcVolume(height, width, depth);
        double val2 = ShapeCalc.calcVolume(b.height, b.width, b.depth);

        if (val < val2) {
            return -1;
        } else if (val == val2) {
            return 0;
        } else {
            return 1;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
