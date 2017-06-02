/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import java.util.ArrayList;
import model.Car;

import model.InspectionChecklist;
import model.InspectionResult;

/**
 *
 * @author jocke
 */

public class Inspection {
    
        private Car car;
        private InspectionChecklist checklist;
        private InspectionResult result;
        private double price;
        
        //constructor creating a car, inspectionchecklist, inspectionsresult object and adding a price. 
        public Inspection(String regnr, double price){
            this.car = new Car(regnr);
            this.checklist = new InspectionChecklist(null, null);
            this.result = new InspectionResult(null, false);
            this.price = price;
        }

        //getters
    public Car getCar() {
        return car;
    }

    public InspectionChecklist getChecklist() {
        return checklist;
    }

    public InspectionResult getResult() {
        return result;
    }

    public double getPrice() {
        return price;
    }

    //returns the cost peforming the inspectiones in the retrieved array
   public static double calculateCost(ArrayList<Inspection> inspections) {
        double cost = 0;
        for(Inspection inspection: inspections)
            cost+= inspection.getPrice();
        
        return cost;
    }
        
}
