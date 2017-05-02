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
        double price = contr.enterRegNumber("NWO 611");
        contr.payment(price);
        
        for(int i = 0; i < contr.inspections.size(); i++){
            contr.nextInspection(i);
            contr.storeResult(i, "Result input");
        }
        
        contr.operateDoor(true);
        contr.operateDoor(false);
        
    }
    
}
