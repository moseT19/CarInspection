/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *  Class regarding exceptions when no inspections are found
 * @author jocke
 */
public class NoInspectionsException extends Exception{
    
    /**
     * Creates a new instance of this exception 
     * @param msg is the exception message thrown
     */
    public NoInspectionsException(String msg){
        super(msg);
    }
    
}
