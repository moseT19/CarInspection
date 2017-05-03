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
    
    //the database containg all inspections is created 
    public Database db = new Database();
    //constructor
    public DatabaseManager(){
        
    }
    
    //returns an array containing all inspections regarding input reg number
    //inspections are located in the "database" and gathered with a loop going through all object and compering the cars reg number with the inputed reg number
    //when these inspections are found the checklist object is modified with the purpose of making the printout easier to udnerstand. 
    public ArrayList<Inspection> findInspectionsByRegNr(String reg){
        
        ArrayList<Inspection> foundInspections = new ArrayList<>();
       
        int i;
       
        for(i = 0; i < db.inspectionsInDb.size(); i++){
            
            if(db.inspectionsInDb.get(i).getCar().getRegNumber().equals(reg)){
                
                db.inspectionsInDb.get(i).getChecklist().setInspectionId("dummyId "+i);
                db.inspectionsInDb.get(i).getResult().setInspecId("dummyId"+i);
                db.inspectionsInDb.get(i).getChecklist().setInspectionSteps("dummy steps "+i);
                foundInspections.add(db.inspectionsInDb.get(i));
            }
        }
        
        return foundInspections;
    }
    
    //stores the result int the correct inspection in the database using the index from agrument "int i" 
    public void storeResult(int i, String result){
        db.inspectionsInDb.get(i).getResult().setInspecResult(result);
                
    }
    
}
