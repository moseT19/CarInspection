/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jocke
 */
public class GarageDoor {
    
        private boolean doorStatus = false;
    
        public GarageDoor(){
            
        }
        
        public void operateDoor(boolean status){
            this.doorStatus = status;
            System.out.println(this.toString());
        }

    @Override
    public String toString() {
        return "GarageDoor" + ": open= " + doorStatus;
    }
    
        
}
