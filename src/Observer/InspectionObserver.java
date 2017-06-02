/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import integration.Inspection;

/**
 * Inspection observer interface 
 * @author jocke
 */
public interface InspectionObserver {
    
    /**
     * The abstract method for all observers. 
     * @param inspection is the inspection currently undergoing the inspection where the observer will note if pass or fail
     */
    public void newInspection(Inspection inspection);
    
}
