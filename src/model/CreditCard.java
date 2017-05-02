/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jocke
 */
public class CreditCard {
    
    private final int pin, cvc;
    private final String number, holder, date;
    
    //constructor
    public CreditCard(int pin, String number, String holder, String date, int cvc){
        this.pin = pin;
        this.number = number;
        this.holder = holder;
        this.date = date;
        this.cvc = cvc;
    }
    
    //get methods
    public int getPin() {
        return pin;
    }

    public int getCvc() {
        return cvc;
    }

    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public String getDate() {
        return date;
    }
    
}
