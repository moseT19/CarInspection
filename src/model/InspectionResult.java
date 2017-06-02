/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jocke
 */
public class InspectionResult {
    
    private String inspecId;
    private boolean inspecResult;
    
    //constructor
    public InspectionResult(String inspecid, boolean inspecResult){
            this.inspecId = inspecid;
            this.inspecResult = inspecResult;
    }
    
    //get
    public String getInspecId() {
        return inspecId;
    }

    public boolean getInspecResult() {
        return inspecResult;
    }
    
    //set
    public void setInspecId(String inspecId) {
        this.inspecId = inspecId;
    }

    public void setInspecResult(boolean inspecResult) {
        this.inspecResult = inspecResult;
    }

    //toString method
    @Override
    public String toString() {
        return "InspectionResult: Id: "+inspecId+" Result: "+ inspecResult;
    }
    
    
}
