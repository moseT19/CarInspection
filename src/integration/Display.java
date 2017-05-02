/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 *
 * @author jocke
 */
public class Display {
    
    private int displayNumber; 
    
    public Display(){
        this.displayNumber = 1;
    }

    public void incrementNumber() {
        displayNumber++;
    }


    @Override
    public String toString() {
        return "Now serving: " + displayNumber;
    }
    
}
