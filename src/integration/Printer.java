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
        System.out.println("**Customer recieves a receipt of the payment. ");
        System.out.println("Receipt: " + price);
    }
    
    //prints the result for every inspection performed in the input array
    public void printResult(ArrayList<Inspection> inspections){
        System.out.println("\n**The program sends a printout of the results to the printer. ");
        for (Inspection inspection : inspections) {
            System.out.println(inspection.getResult().toString());
        }
    }
    
}
