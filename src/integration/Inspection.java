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
        public InspectionChecklist checklist;
        private InspectionResult result;
        private double price;
    
        public Inspection(String regnr, double price){
            this.car = new Car(regnr);
            this.checklist = new InspectionChecklist(null, null);
            this.result = new InspectionResult(null, null);
            this.price = price;
        }

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

   public static double calculateCost(ArrayList<Inspection> inspections) {
        double cost = 0;
        for(Inspection inspection: inspections)
            cost+= inspection.getPrice();
        
        return cost;
    }
        
}
