/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import integration.DatabaseManager;
import integration.Inspection;
import integration.PaymentAuthorization;
import integration.Printer;
import java.util.ArrayList;
import model.CreditCard;

import integration.Display;
import model.GarageDoor;
import model.InspectionChecklist;

/**
 *
 * @author jocke
 */
//class controller
public class Controller {
    
    private Display display;
    private GarageDoor garageDoor;
    public DatabaseManager dbManager;
    public Printer printer;
    private PaymentAuthorization auth;
    public ArrayList<Inspection> inspections = new ArrayList<>();
    
    //constructor for the controler to initiate neccesary objects
    public Controller(){
        this.display = new Display(); 
        this.garageDoor = new GarageDoor(); 
        this.dbManager = new DatabaseManager();
        this.auth = new PaymentAuthorization();
        this.printer = new Printer();
    }
    
    //operates door, true = open, false = closed
    public void operateDoor(boolean status){
        garageDoor.operateDoor(status);
    }
    
    //this method initiates next inspection by incrementing displaynumber and opening garage door
    public void callNextInspection(){
        display.incrementNumber();
        System.out.println("\n**Instructor calls for next inspection. Program updates display and open the garagedoor. ");
        System.out.println(display.toString());
        garageDoor.operateDoor(true);
        System.out.println("\n**When the customer has entered the program closes  the garagedoor upon instruction from instructor. ");
        
        
    }
    
    //this method return the calculated cost for perfoming the inspection
    public double enterRegNumber(String regnr){
        inspections = dbManager.findInspectionsByRegNr(regnr);
        System.out.println("\n**Instructor enters the car registration number and the program locates inspections to be performed in the database. \n The program then returns the total cost of this inspection. ");
        return Inspection.calculateCost(inspections);
    }
    
    //Returns a InspectionChecklist containg information regarding the inspections to be done on this registration number
    public InspectionChecklist nextInspection(int i){
            
        return inspections.get(i).getChecklist();
    }
    
    //calls the method store result in the databasemanager
    public void storeResult(int i, String result){
        System.out.print("**Program stores the result in database through the database manager. \n");
        //dbManager.storeResult(inspections.get(i), result);
        dbManager.storeResult(i, result);
    }
    
    
    //initiates the payment procedure and send the payment authorization request and print request
    public void payment(double price){
        System.out.println("\n**The program tells the customer what price to pay and customer enters creditcard information. ");
        System.out.println("Amount to pay: "+ price);
        CreditCard customerCreditCard = new CreditCard(1234, "1234 5678 9012 3456", "Johnie doe", "05/21", 007);
        if(auth.authorizePayment(customerCreditCard, price)){
            printer.printReceipt(price);
        }
        else{
            //denied payment
        }
    }
    
}
