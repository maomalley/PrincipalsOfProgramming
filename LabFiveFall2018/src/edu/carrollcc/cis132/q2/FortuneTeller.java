package edu.carrollcc.cis132.q2;
import java.util.Random;    // Needed for the Random class

/**
 * This class has a FortuneTeller method to return a fortune depending on
 * which random number is generated.
 * @author Maureen OMalley
 */

public class FortuneTeller {
    /**
     * This method gets a random number and returns a saying that matches up
     * with that random number.
     * @return String containing a randomized saying.
     */
    public String readFortune() {
        Random randomNumber = new Random();     // Create a Random object
        int response = randomNumber.nextInt(9) + 1; //Get a random number from 1-9
        String speach;  // To hold the fortune
        
        switch (response) {
            case 1:
                speach = "Most likely.";
                break;
            case 2:
                speach = "It is certain.";
                break;
            case 3:
                speach = "Yes, definitely!";
                break;  
            case 4:
                speach = "Signs point to yes.";
                break;    
            case 5:
                speach = "Ask again later.";
                break;    
            case 6:
                speach = "Concentrate and ask again.";
                break;  
            case 7:
                speach = "My sources say NO.";
                break;   
            case 8:
                speach = "Don't count on it!";
                break;      
            default:
                speach = "You've got to be kidding!";
                break;   
        }
        return speach;
    }
}
