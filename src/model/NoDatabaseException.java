/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * The class for handling database exception
 * @author jocke
 */

public class NoDatabaseException extends Exception {
    
    /**
     * Creates a new instance of this exception 
     * @param msg is the exception message thrown
     */
    public NoDatabaseException(String msg){
        super(msg);
    }
    
}
