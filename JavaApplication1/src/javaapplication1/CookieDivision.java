/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Maureen
 */
public class CookieDivision {
    public static void main(String[] args)
    {
        int cookies = 18;
        int people = 4;
        double cookiesPerPerson;
        cookiesPerPerson = (double)cookies / people;
        System.out.println("You each get " + cookiesPerPerson + " with no cookies left.");
    }
}
