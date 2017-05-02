/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;



import View.View;
import controller.Controller;

/**
 *
 * @author jocke
 */
public class main {
    
        public static void main(String[] args) {
        
            
            Controller contr = new Controller();
            View view = new View(contr);
            
            
    }
}
