package View;


import controller.Controller;


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
    
    //constructor for view class
    public View(Controller contr){
        
        contr.callNextInspection();
        contr.operateDoor(false);
        double price = contr.enterRegNumber("abc123");
        contr.payment(price);
        
        for(int i = 0; i < contr.inspections.size(); i++){
            System.out.println("\n"+contr.nextInspection(i).toString());
            //the storeresult method sends the index in the "database" of the inspection perfomed in order to set the result on the correct inspection. 
            contr.storeResult(contr.dbManager.db.inspectionsInDb.indexOf(contr.inspections.get(i)), "Result input"+contr.dbManager.db.inspectionsInDb.indexOf(contr.inspections.get(i)));
            
        }
        contr.printer.printResult(contr.inspections);
        
        contr.operateDoor(true);
        contr.operateDoor(false);
        
    }
    
}
