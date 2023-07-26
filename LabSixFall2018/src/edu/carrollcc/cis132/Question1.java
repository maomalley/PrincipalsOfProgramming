package edu.carrollcc.cis132;

import java.util.Scanner;   // to read input
import edu.carrollcc.cis132.q1.Sphere;
import edu.carrollcc.cis132.q1.Box;
import edu.carrollcc.cis132.q1.Cylinder;

/**
 * Question 1 [50 Points] Shape Calculator
 * 
 * Part 1
 * ------
 * Write a ShapeCalc class in the edu.carrollcc.cis132.q1 package that has three overloaded 
 * static methods for calculating the volumes of the following geometric 
 * shapes: spheres, boxes, and cylinders.
 * 
 * Because the methods are to be overloaded, they should each have the 
 * same name, but different parameter lists.
 * 
 * Here are the formulas for calculating the volumes of the shapes.
 * 
 * Sphere volume = (4/3) * Math.PI * radius * radius * radius
 * 
 * Box volume = width * height * depth
 * 
 * Right Cylinder volume = Math.PI * radius * radius * height
 * 
 * Part 2
 * ------
 * Create Sphere, Box, and Cylinder Classes in the edu.carrollcc.cis132.q1.
 * 1. Each class should have private attributes to hold their appropriate dimensions.
 * 2. Each class should have appropriate getters and setters, setters should use 'this' object
 *      object to set the attribute and the parameter should be same name as the attribute.
 *      ex) setRadius(double radius){
 *              this.radius = radius;
 *          }
 * 3. Each class should have a no-arg constructor that sets all their attributes to 0
 * 4. Each class should have a multiple argument constructor that sets the attributes
 *      to the arguments passed in. Use 'this' object and have your parameter names match
 *      the attribute names. (see #2 for example)
 * 5. Each class should have a copy constructor that accepts an object of same type as parameter. x
 * 6. Each class should have a calcVolume() method that calls the appropriate ShapeCalc
 * method you wrote in Part 1. x
 * 7. Each class should have a toString method to print the dimensions of the shape x
 * 8. Each class should have an equals method that determines if the shapes are equal 
 * based on their dimensions. x
 * 9. Each class should have a compareTo method that takes class object as argument and returns:
 *          -1 if the calling object is smaller in volume than argument object (use your calcVolume()
 *              that was declared in the Question1.java class)
 *           0 if the calling object is the same in volume as argument object
 *           1 if the calling object is larger in volume than argument object
 * 10. Create an Enumerated Type outside your main method called Shape that contains  x
 *          0 ordinal position = SPHERE
 *          1 ordinal position = BOX
 *          2 ordinal position = CYLINDER
 *  
 * 11. Demonstrate the classes and enumerated type in the main method by presenting 
 * the user with selection of shape.
 * EXAMPLE:
 * ===============================
 * Welcome to the Shape Calculator
 * ===============================
 * Select a shape from the menu:
 * 1. Sphere
 * 2. Box
 * 3. Cylinder
 * Enter (1-3):
 * ===============================
 * 
 * 12. Declare a variable that is data type of your enumerated type and store the value
 * based on their selection.
 * 
 * 13. Write 3 static methods (getSphereObj, getBoxObj, getCylinderObj) in your 
 * Question.java class that ask the user for  * the appropriate dimensions for the shape. 
 * The methods should call the appropriate constructor with the dimensions and return a reference to a copy
 * of the object. Do not allow negative numbers and loop until they enter a positive number.
 * 
 * 14. Present another menu that asks if they want to compare two shapes or calculate the volume.
 * EXAMPLE:  (if they chose a Sphere above)
 * ================================================
 * What would you like to do with your SPHERE?  //HINT: use your enum type variable to print shape type
 * 1. Calculate volume
 * 2. Compare to another SPHERE  //HINT: use your enum type variable to print shape type
 * Enter 1 or 2:
 * ================================================
 * 
 * 15. Depending on the user's answer in #14: (for our EXAMPLE We are using SPHERE)
 *      if 1: 
 *          a) create a reference variable of the appropriate class type (HINT: don't use new to create object)
 *          b) call the method your wrote in #13 to collect your data for the shape. 
 *              reference variable created in a) should point to the return value.
 *          EXAMPLE: 
 *          ===========================
 *          Enter a radius value: 10
 *          ===========================
 *          c) call the object's calcVolume method you wrote in #6. Store return value in a variable.
 *          d) Print a nicely formatted message to the user that uses your object's
 *              toString method from #7, the enum type variable from #12.
 *             EXAMPLE:
 *              ======================================
 *              A SPHERE with dimensions:
 *              Radius: 10
 *              Has a volume of: 4,188.79 cubic units.   //Hint: Use printf to get commas and 2 decimal places
 *              ======================================
 * 
 *      if 2:
 *          a) create 2 reference variables of the appropriate class type (HINT: don't use new to create objects)
 *          b) call the method your wrote in #13 to collect your data for the shape. 
 *              reference variable created in a) should point to the return value. 
 *              Do this for each one.
 *          c) use the objects to compare their volumes using the compareTo method
 *              you wrote in #9 and print a nicely formatted message to the user
 *              that uses your object's toString method from #7 and the enum type variable
 *              from #12
 *          EXAMPLE: 
 *          ===========================
 *          Enter a radius value: 10
 *          Enter a radius value: 12
 *          A SPHERE with dimensions:
 *          Radius: 10
 *          is SMALLER than 
 *          A SPHERE with dimensions:
 *          Radius: 12
 *          ===========================
 * 
 *
 * Comments and style are worth up to 2 points.
 * 
 * 
 * SAMPLE OUTPUT 
===============================
Welcome to the Shape Calculator
===============================
Select a shape from the menu:
1. Sphere
2. Box
3. Cylinder
Enter (1-3):
===============================
1
================================
What do you want to do with your SPHERE
1. Calculate volume
2. Compare to another SPHERE
Enter 1 or 2: 
================================
2
Enter a radius value: 10
Enter a radius value: 12
A SPHERE with dimensions:
Radius: 10.0
is SMALLER than 
A SPHERE with dimensions:
Radius: 12.0
======================================
 *
 * @author Maureen OMalley
 */

/**
 * This program demonstrates the use of the ShapeCalc, Sphere, Box, and Cylinder
 * classes to create a Shape Calculator.
 *
 * @author Maureen O'Malley
 */
public class Question1 {

    // Enumerated Type contains SPHERE, BOX, and CYLINDER.
    enum Shape {
        SPHERE, BOX, CYLINDER
    }

    public static void main(String[] args) {
        // Scanner for user input.
        Scanner keyboard = new Scanner(System.in);

        // Welcome message gets a user's choice and stores it.
        System.out.print("===============================\n"
                + "Welcome to the Shape Calculator\n"
                + "===============================\nSelect a shape from the menu:"
                + "\n1. Sphere\n2. Box\n3. Cylinder\nEnter (1-3):\n");
        int choice = keyboard.nextInt();

        // Program loops until a valid choice is entered.
        while (choice <= 0 || choice >= 4) {
            System.out.println("Error: Please enter a either 1, 2, or 3.");

            System.out.print("===============================\n"
                    + "Welcome to the Shape Calculator\n"
                    + "===============================\nSelect a shape from the menu:"
                    + "\n1. Sphere\n2. Box\n3. Cylinder\nEnter (1-3):\n");
            choice = keyboard.nextInt();
        }

        // Switch statement to act based off user's choice
        switch (choice) {
            case 1:
                // Store enumerated data
                Shape userSphere = Shape.SPHERE;

                // Menu gets a user's choice to either calculate volume or 
                // compare shapes and stores that choice
                System.out.print("============================================"
                        + "====\nWhat would you like to do with your "
                        + userSphere + "?\n1. Calculate volume\n"
                        + "2. Compare to another " + userSphere
                        + "\nEnter 1 or 2:\n");
                int sphereChoice = keyboard.nextInt();
                
                // Loop until user enters a valid choice.
                while (sphereChoice <= 0 || sphereChoice >= 3) {
                    System.out.println("Error: please enter either 1 or 2.");
                    System.out.print("============================================"
                        + "====\nWhat would you like to do with your "
                        + userSphere + "?\n1. Calculate volume\n"
                        + "2. Compare to another " + userSphere
                        + "\nEnter 1 or 2:\n");
                    sphereChoice = keyboard.nextInt();
                }

                // Either calculate volume if 1 is chosen or compare two spheres
                // if 2 is chosen. Terminate is invalid choice is entered.
                if (sphereChoice == 1) {
                    // Reference variable calls getSphereObj() method
                    Sphere sph = getSphereObj();

                    // sphereVolume is the sphere's volume as calculated in
                    // ShapeCalc class and returned from Sphere class
                    double sphereVolume = sph.calcVolume();

                    // Print message with formatting
                    System.out.print("A " + userSphere + " with dimensions:\n");
                    System.out.println(sph.toString());
                    System.out.printf("Has a volume of: %,.2f cubic units.",
                            sphereVolume);
                    System.out.println("\n===========================");
                } else if (sphereChoice == 2) {
                    // Reference variables call getSphereObj() method
                    Sphere sph1 = getSphereObj();
                    Sphere sph2 = getSphereObj();

                    // Compare the two objects using Sphere class compareTo
                    int val = sph1.compareTo(sph2);

                    // Use the value returned from comparing to act based off comparison
                    if (val == -1) {
                        System.out.print("A " + userSphere + 
                                        " with the dimensions:\n");
                        System.out.println(sph1.toString());
                        System.out.println("is SMALLER than\nA " + userSphere + 
                                            " with dimensions:");
                        System.out.println(sph2.toString());
                    } else if (val == 0) {
                        System.out.print("A " + userSphere + 
                                        " with the dimensions:\n");
                        System.out.println(sph1.toString());
                        System.out.println("is EQUAL TO\nA " + userSphere + 
                                            " with dimensions:");
                        System.out.println(sph2.toString());
                    } else if (val == 1) {
                        System.out.print("A " + userSphere + 
                                        " with the dimensions:\n");
                        System.out.println(sph1.toString());
                        System.out.println("is GREATER THAN\nA " + userSphere + 
                                            " with dimensions:");
                        System.out.println(sph2.toString());
                    } else {
                        System.out.println("Error.");
                    }
                } else {
                    System.out.println("Error: invalid choice");
                }
                break;
            case 2:
                Shape userBox = Shape.BOX;
                System.out.print("============================================"
                        + "====\nWhat would you like to do with your "
                        + userBox + "?\n1. Calculate volume\n"
                        + "2. Compare to another " + userBox
                        + "\nEnter 1 or 2:\n");
                int boxChoice = keyboard.nextInt();
                
                // Loop until user enters a valid choice.
                while (boxChoice <= 0 || boxChoice >= 3) {
                    System.out.println("Error: please enter either 1 or 2.");
                    System.out.print("============================================"
                        + "====\nWhat would you like to do with your "
                        + userBox + "?\n1. Calculate volume\n"
                        + "2. Compare to another " + userBox
                        + "\nEnter 1 or 2:\n");
                    boxChoice = keyboard.nextInt();
                }                
                
                if (boxChoice == 1) {
                    Box bx = getBoxObj();

                    double boxVolume = bx.calcVolume();
                    System.out.print("A " + userBox + " with dimensions:\n");
                    System.out.println(bx.toString());
                    System.out.printf("Has a volume of: %,.2f cubic units.",
                            boxVolume);
                    System.out.println("\n===========================");
                } else if (boxChoice == 2) {
                    Box bx1 = getBoxObj();
                    Box bx2 = getBoxObj();

                    int val = bx1.compareTo(bx2);

                    if (val == -1) {
                        System.out.print("A " + userBox + " with the dimensions:\n");
                        System.out.println(bx1.toString());
                        System.out.println("is SMALLER than\nA " + userBox + 
                                        " with dimensions:");
                        System.out.println(bx2.toString());
                    } else if (val == 0) {
                        System.out.print("A " + userBox + " with the dimensions:\n");
                        System.out.println(bx1.toString());
                        System.out.println("is EQUAL TO\nA " + userBox + 
                                        " with dimensions:");
                        System.out.println(bx2.toString());
                    } else if (val == 1) {
                        System.out.print("A " + userBox + " with the dimensions:\n");
                        System.out.println(bx1.toString());
                        System.out.println("is GREATER THAN\nA " + userBox + 
                                        " with dimensions:");
                        System.out.println(bx2.toString());
                    } else {
                        System.out.println("Error.");
                    }

                } else {
                    System.out.println("Error: invalid choice.");
                }
                break;
            case 3:
                Shape userCylinder = Shape.CYLINDER;
                System.out.print("============================================"
                        + "====\nWhat would you like to do with your "
                        + userCylinder + "?\n1. Calculate volume\n"
                        + "2. Compare to another " + userCylinder
                        + "\nEnter 1 or 2:\n");
                int cylinderChoice = keyboard.nextInt();
                
                // Loop until user enters a valid choice.
                while (cylinderChoice <= 0 || cylinderChoice >= 3) {
                    System.out.println("Error: please enter either 1 or 2.");
                    System.out.print("============================================"
                        + "====\nWhat would you like to do with your "
                        + userCylinder + "?\n1. Calculate volume\n"
                        + "2. Compare to another " + userCylinder
                        + "\nEnter 1 or 2:\n");
                    cylinderChoice = keyboard.nextInt();
                }      
                
                if (cylinderChoice == 1) {
                    Cylinder cyl = getCylinderObj();

                    double cylinderVolume = cyl.calcVolume();
                    System.out.print("A " + userCylinder + " with dimensions:\n");
                    System.out.println(cyl.toString());
                    System.out.printf("Has a volume of: %,.2f cubic units.",
                            cylinderVolume);
                    System.out.println("\n===========================");
                } else if (cylinderChoice == 2) {
                    Cylinder cyl1 = getCylinderObj();
                    Cylinder cyl2 = getCylinderObj();

                    int val = cyl1.compareTo(cyl2);

                    if (val == -1) {
                        System.out.print("A " + userCylinder + 
                                        " with the dimensions:\n");
                        System.out.println(cyl1.toString());
                        System.out.println("is SMALLER than\nA " + userCylinder 
                                        + " with dimensions:");
                        System.out.println(cyl2.toString());
                    } else if (val == 0) {
                        System.out.print("A " + userCylinder + 
                                        " with the dimensions:\n");
                        System.out.println(cyl1.toString());
                        System.out.println("is EQUAL TO\nA " + userCylinder 
                                        + " with dimensions:");
                        System.out.println(cyl2.toString());
                    } else if (val == 1) {
                        System.out.print("A " + userCylinder + 
                                        " with the dimensions:\n");
                        System.out.println(cyl1.toString());
                        System.out.println("is GREATER THAN\nA " + userCylinder 
                                        + " with dimensions:");
                        System.out.println(cyl2.toString());
                    } else {
                        System.out.println("Error.");
                    }
                } else {
                    System.out.println("Error: invalid choice.");
                }
                break;
            default:
                System.out.println("Error: invalid choice selected.");
                break;
        }

    }

    /**
     * static method getSphereObj() asks the user for sphere radius, calls the
     * Sphere constructor, and returns a reference to the copy of the object.
     * the program loops until a positive number is entered.
     *
     * @return reference to the copy of the Sphere object
     */
    public static Sphere getSphereObj() {
        Scanner scanSphere = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("What is the radius of the sphere?");
        double sphereRadius = scanSphere.nextDouble();

        while (sphereRadius <= 0) {
            System.out.println("Error: please enter a positive radius.");
            System.out.println("What is the radius of the sphere?");
            sphereRadius = scanSphere.nextDouble();
        }

        Sphere copySphere = new Sphere(sphereRadius);
        return copySphere;
    }

    /**
     * static method getBoxObj() asks the user for box dimensions, calls the Box
     * constructor, and returns a reference to the copy of the object. the
     * program loops until a positive number is entered.
     *
     * @return reference to the copy of the Box object
     */
    public static Box getBoxObj() {
        Scanner scanBox = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("What is the height of the box?");
        double boxHeight = scanBox.nextDouble();

        while (boxHeight <= 0) {
            System.out.println("Error: please enter a positive box height.");
            System.out.println("What is the height of the box?");
            boxHeight = scanBox.nextDouble();
        }

        System.out.println("What is the width of the box?");
        double boxWidth = scanBox.nextDouble();

        while (boxWidth <= 0) {
            System.out.println("Error: please enter a positive box width.");
            System.out.println("What is the width of the box?");
            boxWidth = scanBox.nextDouble();
        }

        System.out.println("What is the depth of the box?");
        double boxDepth = scanBox.nextDouble();

        while (boxDepth <= 0) {
            System.out.println("Error: please enter a positive box depth.");
            System.out.println("What is the depth of the box?");
            boxDepth = scanBox.nextDouble();
        }

        Box copyBox = new Box(boxHeight, boxWidth, boxDepth);
        return copyBox;
    }

    /**
     * static method getSphereObj() asks the user for cylinder dimensions, calls
     * the Cylinder constructor, and returns a reference to the copy of the
     * object. The program loops until a positive number is entered.
     *
     * @return reference to the copy of the Cylinder object
     */
    public static Cylinder getCylinderObj() {
        Scanner scanCylinder = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("What is the radius of the cylinder?");
        double cylinderRadius = scanCylinder.nextDouble();

        while (cylinderRadius <= 0) {
            System.out.println("Error: please enter a positive cylinder radius.");
            System.out.println("What is the radius of the cylinder?");
            cylinderRadius = scanCylinder.nextDouble();
        }

        System.out.println("What is the height of the cylinder?");
        double cylinderHeight = scanCylinder.nextDouble();

        while (cylinderHeight <= 0) {
            System.out.println("Error: please enter a positive cylinder height.");
            System.out.println("What is the height of the cylinder?");
            cylinderHeight = scanCylinder.nextDouble();
        }

        Cylinder copyCylinder = new Cylinder(cylinderRadius, cylinderHeight);
        return copyCylinder;
    }
}
