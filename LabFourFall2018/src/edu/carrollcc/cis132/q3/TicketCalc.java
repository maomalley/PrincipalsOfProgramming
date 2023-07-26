package edu.carrollcc.cis132.q3;

/**
 * This class determines how many miles per hour over the speed limit the
 * violator's speed was and uses a method to determine what ticket they will
 * receive.
 * @author Maureen OMalley
 */
public class TicketCalc {
    private int speedLimit;     //field to hold the speed limit
    private int yourSpeed;      //field to hold the violator's speed
    
    /**
     * The constructor accepts 2 parameters representing the speed limit and
     * the violator's speed.
     * @param limit integer representing the speed limit
     * @param spd  integer representing the violator's speed
     */
    public TicketCalc(int limit, int spd){
        speedLimit = limit;
        yourSpeed = spd;
    }
    
    public int getLimit() {
        return speedLimit;
    }
    
    public int getSpd() {
        return yourSpeed;
    }
    
    public void setLimit(int limit) {
        speedLimit = limit;
    }
    
    public void setSpd(int spd) {
        yourSpeed = spd;
    }
    
    /**
     * This method determines which ticket the violator will receive by
     * subtracting the speedLimit from yourSpeed to determine how high
     * over the speed limit the violator was going.
     * @return String that indicates which ticket the violator will receive.
     */
    public String getTicket() {
        String ticket;
        
        if ((yourSpeed - speedLimit) <= 0){
            ticket = "You were not going over the speed limit.";
        }
        else if ((yourSpeed - speedLimit) >=1 && (yourSpeed - speedLimit) < 12){
            ticket = "You receive a warning.";
        }
        else if ((yourSpeed - speedLimit) >= 12 && (yourSpeed - speedLimit) < 20)
        {
            ticket = "You receive a speeding ticket with a $200.00 fine.";
        }
        else if ((yourSpeed - speedLimit) >= 20 && (yourSpeed - speedLimit) < 25)
        {
            ticket = "You receive a speeding ticket with a $300.00 fine and 2 "
                    + "points.";
        }
        else if ((yourSpeed - speedLimit) >= 25 && (yourSpeed - speedLimit) < 40)
        {
            ticket = "You receive a reckless driving ticket with $500.00 fine "
                    + "and 5 points.";
        }
        else
        {
            ticket = "You receive a reckless driving ticket with $1000.00 fine "
                    + "and 12 points.";
        }
        
        return ticket;
    }
}
