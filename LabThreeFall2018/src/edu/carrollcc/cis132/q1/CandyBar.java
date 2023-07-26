package edu.carrollcc.cis132.q1;

/**
 * This class holds the number of candy bars that can be produced in an hour and
 * the number of hours the plant is operating per day. It them returns the product
 * of the two.
 * @author Maureen OMalley
 */

public class CandyBar {
    /**
     * Field to hold the number of candy bars that can be produced in an hour
     */
    private int candyProduced;
    /**
     * Field to hold the number of hours the plant is operating per day
     */
    private int hoursOperated;
    /**
     * Field to hold the desired candy amount
     */
    private int candyAmount;
    
    /**
     * Constructor
     * @param cndyP the number of candy bars that can be produced in an hour
     * @param hrsO the number of hours the plant is operating per day
     * @param cndyAmnt the number of desired candy bars
     */
    public CandyBar(int cndyP, int hrsO, int cndyAmnt) {
        candyProduced = cndyP;
        hoursOperated = hrsO;
        candyAmount = cndyAmnt;
    }
    
   /* 
    * Setter for the number of candy bars the plant produces per day
    * @param cndyP the number of candy bars produced to set cndyP to
    */
   public void setCndyP(int cndyP) {
       candyProduced = cndyP;
   }
   
   /* 
    * Setter for the number of hours the plant operates per day
    * @param hrsO the number of hours to set hoursOperated to
    */
   public void setHrsO(int hrsO) {
       hoursOperated = hrsO;
   }
   
   /* 
    * Setter for the desired candy bar amount
    * @param cndyAmnt the number of desired candy bars to set cndyAmnt to
    */
   public void setCndyAmnt(int cndyAmnt) {
       candyAmount = cndyAmnt;
   }
    
   /*
    * Getter for the number of candy bars the plant produces per day
    * @return int representing the number of candy bars the plant produces per day
    */
   public int getCndyP() {
       return candyProduced;
   }
   
   /*
    * Getter for the number of hours the plant operates per day
    * @return int representing the number of hours the plant operates per day
    */
   public int getHrsO() {
       return hoursOperated;
   }
   
   /*
    * Getter for the number of desired candy bars
    * @return int representing the desired number of candy bars to produce
    */
   public int getCndyAmnt() {
       return candyAmount;
   }   
   
    /**
    * Calculate the number of days the plant will take to produce the
    * desired candy amount by dividing the desired candy amount by the
    * product of the number of hours the plant is operating per day
    * and the number of candy bars the plant can produce per day.
    * @return the number of days the plant will take to produce the desired candy amount
    */
    public double getDays() {
        return (double)(candyAmount) / (double)(hoursOperated * candyProduced);
    }
}