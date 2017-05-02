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
    
    private String inspecId, inspecResult;
    
    
    public InspectionResult(String inspecid, String inspecResult){
            this.inspecId = inspecid;
            this.inspecResult = inspecResult;
    }

    public String getInspecId() {
        return inspecId;
    }

    public String getInspecResult() {
        return inspecResult;
    }

    public void setInspecId(String inspecId) {
        this.inspecId = inspecId;
    }

    public void setInspecResult(String inspecResult) {
        this.inspecResult = inspecResult;
    }

    @Override
    public String toString() {
        return "InspectionResult: Id: "+inspecId+" Result: "+ inspecResult;
    }
    
    
}
