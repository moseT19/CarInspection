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
public class InspectionChecklist {
    
    private String inspectionId;
    private String inspectionSteps;
    
    //constructor
    public InspectionChecklist(String inspid, String inspsteps){
        this.inspectionId = inspid;
        this.inspectionSteps = inspsteps;
    }
    //get
    public String getInspectionId() {
        return inspectionId;
    }

    public String getInspectionSteps() {
        return inspectionSteps;
    }
    
    //set
    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public void setInspectionSteps(String inspectionSteps) {
        this.inspectionSteps = inspectionSteps;
    }
    
    //toString
    @Override
    public String toString() {
        return "InspectionChecklist: \n" + "inspectionId: " + inspectionId + ", inspectionSteps: " + inspectionSteps + "";
    }
    
    
}
