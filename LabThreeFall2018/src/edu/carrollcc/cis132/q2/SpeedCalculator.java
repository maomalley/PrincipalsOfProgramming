package edu.carrollcc.cis132.q2;

/**
 *
 * @author Maureen OMalley
 */
public class SpeedCalculator {
    //field to hold the distance in miles
    private double miles;
    //field to hold the time in hours
    private double hours;
    
   /*
    * Getter for the distance in miles
    * @return double representing the number of miles traveled
    */
    public double getMiles() {
        return miles;
    }
    
   /*
    * Getter for the number of hours traveled
    * @return double representing the number of hours
    */
    public double getHours() {
        return hours;
    }
    
   /* 
    * Setter for the of miles traveled
    * @param m the number of miles traveled to set m to
    */
    public void setMiles(double m) {
        miles = m;
    }
    
   /* 
    * Setter for the of hours traveled
    * @param h the number of hours traveled to set h to
    */
    public void setHours(double h) {
        hours = h;
    }
    
    /**
     * Calculate the miles per hour
     * @return the miles per hour
     */
    public double getSpeed() {
        return (double)(miles / hours);
    }
}
