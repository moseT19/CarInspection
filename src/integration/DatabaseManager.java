/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import Database.Database;
import Observer.InspectionObserver;
import java.util.ArrayList;
import java.util.logging.Logger;
import model.NoDatabaseException;
import model.NoInspectionsException;



/**
 *  Class Database manager
 * @author jocke
 */
public class DatabaseManager{
    
    private ArrayList<InspectionObserver> inspectionObservers = new ArrayList<>();
    /**
     * The database containing the inspections
     */ 
    public Database db = new Database();
    /**
     * Constructor for the database
     */
    public DatabaseManager(){
        
    }
    
    //
    //
    //when these inspections are found the checklist object is modified with the purpose of making the printout easier to udnerstand. 
    /**
     * inspections are located in the "database" and gathered with a loop going through all object and compering the cars reg number with the inputed reg number
     * @param reg is the searched registration number
     * @return returns an array containing all inspections regarding input reg number.
     * @throws Exception when either a database can't be found or no inspections can be found. 
     */
    public ArrayList<Inspection> findInspectionsByRegNr(String reg) throws Exception{
        
        ArrayList<Inspection> foundInspections = new ArrayList<>();
       
        int i;
        if(db == null){
            throw new NoDatabaseException("No connection with the database. ");
        }
        
        for(i = 0; i < db.inspectionsInDb.size(); i++){
            
            if(db.inspectionsInDb.get(i).getCar().getRegNumber().equals(reg)){
                
                db.inspectionsInDb.get(i).getChecklist().setInspectionId("dummyId "+i);
                db.inspectionsInDb.get(i).getResult().setInspecId("dummyId"+i);
                db.inspectionsInDb.get(i).getChecklist().setInspectionSteps("dummy steps "+i);
                foundInspections.add(db.inspectionsInDb.get(i));
            }
        }
       if(foundInspections.size() == 0){
           throw new NoInspectionsException("No inspections can be found for reg number "+ reg + ". ");
       }
       
        
        return foundInspections;
    }
    
    /**
     * stores the result in the correct inspection in the database
     * @param i is the index in the database
     * @param result is the boolen if the inspection passed or failed
     */ 
    public void storeResult(int i, boolean result){
        db.inspectionsInDb.get(i).getResult().setInspecResult(result);
        notifyObservers(db.inspectionsInDb.get(i));
    }
    
    /**
     * Notifies all observers in the list wit the result of the this inspection
     * @param insp is the registred inspection
     */
    private void notifyObservers(Inspection insp){
        for(InspectionObserver obs: inspectionObservers){
            obs.newInspection(insp);
        }
    }
    
    /**
     * Adds a single observer into the observer list
     * @param obs is the observer to be added into the list
     */
    public void addObserver(InspectionObserver obs){
        inspectionObservers.add(obs);
    }
    
    /**
     * Adds a list of observers into the observer list
     * @param observers the list containing observers to be added
     */
    public void addInspectionObservers(ArrayList<InspectionObserver> observers){
        inspectionObservers.addAll(observers);
    }

    
    
}
