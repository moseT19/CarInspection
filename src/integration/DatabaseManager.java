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
    
    public Database db = new Database();
    //constructor
    public DatabaseManager(){
        
    }
    
    //returns an array containing all inspections regarding input reg number
    //inspections are located in the "database"
    public ArrayList<Inspection> findInspectionsByRegNr(String reg){
        
        ArrayList<Inspection> foundInspections = new ArrayList<>();
       
        int i;
       
        for(i = 0; i < db.inspectionsInDb.size(); i++){
            //locates all inspections tied to registration number from argument
            if(db.inspectionsInDb.get(i).getCar().getRegNumber().equals(reg)){
                //gives inspections dummy id and instruction, the 'i' is added to show in the output that the correct inspection is gathered 
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
