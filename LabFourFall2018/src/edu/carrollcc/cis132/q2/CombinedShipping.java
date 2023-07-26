package edu.carrollcc.cis132.q2;

/**
 * This class determines the shipping charge given the number of items shipped
 * and the number of miles shipped.
 * @author Maureen OMalley
 */
public class CombinedShipping {
    //field to hold the number of itmes shipped
    private double items;
    //field to hold the number of miles shipped
    private double milesShipped;
    
    /**
     * The constructor initializes our fields to 0
     */
    public CombinedShipping(){
        items = 0;
        milesShipped = 0;
    }
    
    public double getItms(){
        return items;
    }
    
    public double getMiles(){
        return milesShipped;
    }
    
    public void setItms(double itms){
        items = itms;
    }
    
    public void setMiles(double miles){
        milesShipped = miles;
    }
    
    /**
     * The getRate method determines the flat rate per 500 miles shipped
     * given the number of items shipped.
     * @return double representing the flat rate per 500 miles shipped
     */
    private double getRate() {
        double rate;
        
        if (items == 1){
            rate = 3.50;
        }
        else if (items >= 2 && items <= 5){
            rate = 4.50;
        }
        else if (items >= 6 && items <= 10){
            rate = 7.50;
        }
        else{
            rate = 9.50;
        }
        
        return (double)(rate);
    }
    
    /**
     * The getCharge method calculates the total shipping charge using the
     * flat shipping rate and miles shipped.
     * @return double representing the total shipping charge
     */
    public double getCharge() {
        double charge;
        double val;
        
        val = (double)(Math.ceil((milesShipped / 500.0)));
        
        charge = (double)(val * getRate());
        
        return (double)(charge);
    }
}
