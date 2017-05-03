/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import integration.Inspection;
import java.util.ArrayList;

/**
 *
 * @author jocke
 */
public class Database {
    
    //an array acting as a fictional database containing dummy inspections 
    public ArrayList<Inspection> inspectionsInDb = new ArrayList<>();
    
    //constructor initiating the "database"
    public Database(){
     Inspection insp1 = new Inspection("abc123", 10);
     Inspection insp2 = new Inspection("abc123", 20);
     Inspection insp3 = new Inspection("abc123", 30);
     Inspection insp4 = new Inspection("abc123", 50);
     Inspection insp5 = new Inspection("abc111", 10);
     Inspection insp6 = new Inspection("abc111", 20);
     Inspection insp7 = new Inspection("abc222", 30);
     Inspection insp8 = new Inspection("abc222", 50);
     inspectionsInDb.add(insp1);
     inspectionsInDb.add(insp6);
     inspectionsInDb.add(insp5);
     inspectionsInDb.add(insp4);
     inspectionsInDb.add(insp3);
     inspectionsInDb.add(insp6);
     inspectionsInDb.add(insp2);
     inspectionsInDb.add(insp8);
     
    }
    
}
