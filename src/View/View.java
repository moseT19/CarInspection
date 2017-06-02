package View;



import Utility.LogHandler;
import controller.Controller;
import model.NoInspectionsException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jocke
 */
public class View {
    
    /**
     * The View class for the user interface
     * @param contr is the controller working with the current user interface
     * @throws Exception when a inspection can't be found. 
     */
    public View(Controller contr) throws Exception{
        
        contr.addInspectionObserver( new InspectionStatsView());
        
        
    }
    /**
     * Sample execute
     * @param contr is the controller for this sample
     * @param loghandler is the loghandler for thsi specific sample
     */
    public void sampleExec(Controller contr, LogHandler loghandler){
        contr.callNextInspection();
        contr.operateDoor(false);
        double price = 0;
        try{
             price = contr.enterRegNumber("kebab");
        }catch(Exception e){
            loghandler.logException(e);
            System.exit(1);
        }
        contr.payment(price);
        
        for(int i = 0; i < contr.inspections.size(); i++){
            System.out.println("\n"+contr.nextInspection(i).toString()); 
            contr.storeResult(contr.dbManager.db.inspectionsInDb.indexOf(contr.inspections.get(i)), true);
            
        }
        contr.printer.printResult(contr.inspections);
        
        contr.operateDoor(true);
        contr.operateDoor(false);
    }
    
}
