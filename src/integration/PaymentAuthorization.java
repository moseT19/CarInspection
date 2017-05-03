/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import model.CreditCard;

/**
 *
 * @author jocke
 */
public class PaymentAuthorization {
    
    
    //constructor
    public PaymentAuthorization(){
        
    }
    
    //returns (in this case true) a boolean with the answer from the "bank" if the purchase was granted or not
    public boolean authorizePayment(CreditCard card, double price){
        System.out.println("\n**The payment is sent to a external payment authorization program which either accepts the payment or denies (in this case always accepted). ");
        return true;
    }
    
}
