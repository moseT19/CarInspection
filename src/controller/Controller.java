/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Observer.InspectionObserver;
import integration.DatabaseManager;
import integration.Inspection;
import integration.PaymentAuthorization;
import integration.Printer;
import java.util.ArrayList;
import model.CreditCard;

import integration.Display;

import java.io.IOException;
import model.GarageDoor;
import model.InspectionChecklist;

/**
 *
 * @author jocke
 */
//class controller
public class Controller {
    
    
    private final Display display;
    private final GarageDoor garageDoor;
    //the global vairable for the database manager is public because its needed outside of this class
    public DatabaseManager dbManager;
    //the printer is global because it's used in other classes
    public Printer printer;
    private final PaymentAuthorization auth;
    //the arraylist containing the inspections to the specific reg number
    public ArrayList<Inspection> inspections = new ArrayList<>();
    private ArrayList<InspectionObserver> observers = new ArrayList<>();
    //constructor for the controler to initiate neccesary objects
    public Controller() throws IOException{
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
    
    /**
     * Calls the next inspection by opening the door and incrementing the display.
     * Adds the observerlist thorugh the databasemanager object
     */
    public void callNextInspection(){
        display.incrementNumber();
        
        System.out.println(display.toString());
        garageDoor.operateDoor(true);
        
        dbManager.addInspectionObservers(observers);
    }
    
    //this method return the calculated cost for perfoming the inspection
    public double enterRegNumber(String regnr) throws Exception{
        inspections = dbManager.findInspectionsByRegNr(regnr);
        
        return Inspection.calculateCost(inspections);
    }
    
    //Returns a InspectionChecklist containg information regarding the inspections to be done on this registration number
    public InspectionChecklist nextInspection(int i){
            
        return inspections.get(i).getChecklist();
    }
    
    /**
     * Calls upon the store result method in databasemanager
     * @param i the index of this inspection
     * @param result a boolean for either pass or fail
     */
    public void storeResult(int i, boolean result){
        
        dbManager.storeResult(i, result);
    }
    
    
    //initiates the payment procedure and send the payment authorization request and print request
    public void payment(double price){
        CreditCard customerCreditCard = new CreditCard(1234, "1234 5678 9012 3456", "Johnie doe", "05/21", 007);
        if(auth.authorizePayment(customerCreditCard, price)){
            printer.printReceipt(price);
        }
        else{
            //denied payment
        }
    }
    
    /**
     * Adds a inspectionObserver into the observer list
     * @param obs the observer to be added
     */
    public void addInspectionObserver(InspectionObserver obs){
        observers.add(obs);
    }
    
}
