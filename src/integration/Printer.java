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
    
    //constructor
    public Printer(){
        
    }
    
    //prints the purchase reciept with the input price
    public void printReceipt(double price){
        System.out.println("Receipt: " + price);
    }
    
    //prints the result for every inspection performed in the input array
    public void printResult(ArrayList<Inspection> inspections){
        for(int i = 0; i < inspections.size(); i++){
            System.out.println(inspections.get(i).getResult().toString());
        }
    }
    
}
