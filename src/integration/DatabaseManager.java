/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import Database.Database;
import java.util.ArrayList;


/**
 *
 * @author jocke
 */
public class DatabaseManager {
    
    public DatabaseManager(){
        
    }
    
    public ArrayList<Inspection> findInspectionsByRegNr(String reg){
        
        ArrayList<Inspection> foundInspections = new ArrayList<>();
        Database db = new Database();
        int i;
       
        for(i = 0; i < db.inspectionsInDb.size(); i++){
            if(db.inspectionsInDb.get(i).getCar().getRegNumber().equals(reg)){
                //gives inspections dummy id's and instructiones
                db.inspectionsInDb.get(i).getChecklist().setInspectionId("dummyId");
                db.inspectionsInDb.get(i).getResult().setInspecId("dummyId");
                db.inspectionsInDb.get(i).getChecklist().setInspectionSteps("dummy steps");
                foundInspections.add(db.inspectionsInDb.get(i));
            }
        }
        
        return foundInspections;
    }
    
    public void storeResult(Inspection inspection, String result){
        inspection.getResult().setInspecResult(result);
                
    }
    
}
