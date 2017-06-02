/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;



import Utility.LogHandler;
import View.View;
import controller.Controller;

import model.NoDatabaseException;



/**
 *  The main class initiating View, Controller, Loghandler along with the sample execution. 
 * @author jocke
 */
public class main {
    
        public static void main(String[] args) throws Exception {
        
            try{
                Controller contr = new Controller();
                View view = new View(contr);
                LogHandler loghandler = new LogHandler();
                view.sampleExec(contr, loghandler);
            }catch(NoDatabaseException e){
                System.out.println("Can not log" + e.getMessage());
            }
            
    }
}
