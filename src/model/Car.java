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
public class Car {
        
        private String regNumber;
        
        public Car(String regnr){
            this.regNumber = regnr;
        }

    public String getRegNumber() {
        return regNumber;
    }
    
}
