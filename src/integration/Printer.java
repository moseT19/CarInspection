/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import java.util.ArrayList;

/**
 *
 * @author jocke
 */
public class Printer {
    
    public Printer(){
        
    }
    
    public void printReceipt(double price){
        System.out.println("Receipt: " + price);
    }
    
    public void printResult(ArrayList<Inspection> inspections){
        for(int i = 0; i < inspections.size(); i++){
            System.out.println(inspections.get(i).getResult().toString());
        }
    }
    
}
