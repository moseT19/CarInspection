/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Observer.InspectionObserver;
import integration.Inspection;

/**
 * CLass InspectionStatsView is a class for keeping track of how many inspections pass and fail. 
 * THis class implements the interface Inspectionobserver and all its abstract methods
 * @author jocke
 */
public class InspectionStatsView implements InspectionObserver{
    
    private int noOfInspectionsPassed = 0, noOfInspectionsFailed = 0;
    
    InspectionStatsView(){
        
    }
    
    /**
     * A method for initiating both the addInspection and printCurrentState
     * @param i is the registerd inspection
     */
    public void newInspection(Inspection i){
        addInspection(i);
        printCurrentState();
    }
    
    /**
     * This method checks if an inspection passed or failed and updates the varibles
     * @param i is the registerd inspection
     */
    public void addInspection(Inspection i) {
        if(i.getResult().getInspecResult())
            noOfInspectionsPassed++;
        else
            noOfInspectionsFailed++;
    }
    
    
    
    private void printCurrentState() {
        System.out.println( "InspectionStatsView: " + "noOfInspectionsPassed = " + noOfInspectionsPassed + ", noOfInspectionsFailed = " + noOfInspectionsFailed);
    }
    
    
    
}
