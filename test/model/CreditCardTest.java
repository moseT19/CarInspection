package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jocke
 */
public class CreditCardTest {
    
    private CreditCard creditCardToTest;
    
    @Before
    public void setUp() {
        creditCardToTest = new CreditCard(9876, "1234 5678 9012 3456", "johnie doei", "01/21", 123);
    }
    
    @After
    public void tearDown() {
        creditCardToTest = null;
    }

    
    @Test
    public void testCreditCardPin() {
        
        
        int expResult = 9876;
        int result = creditCardToTest.getPin();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testCreditCardCvc() {
       
        int expResult = 123;
        int result = creditCardToTest.getCvc();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testCreditCardNumber() {
      
        String expResult = "1234 5678 9012 3456";
        String result = creditCardToTest.getNumber();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testCreditCardHolder() {
        
        String expResult = "johnie doei";
        String result = creditCardToTest.getHolder();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testCreditCardDate() {
        
        String expResult = "01/21";
        String result = creditCardToTest.getDate();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testWrongCreditCardPin() {
        
        
        int expResult = 1234;
        int result = creditCardToTest.getPin();
        assertNotSame("Not equal. ",expResult, result);
        
    }

    
    @Test
    public void testWrongCreditCardCvc() {
       
        int expResult = 321;
        int result = creditCardToTest.getCvc();
        assertNotSame("Not equal. ",expResult, result);
        
    }

   
    @Test
    public void testWrongCreditCardNumber() {
      
        String expResult = "1234 5678 9012 9999";
        String result = creditCardToTest.getNumber();
        assertNotSame("Not equal. ",expResult, result);
        
    }

    
    @Test
    public void testWrongCreditCardHolder() {
        
        String expResult = "johnie not doei";
        String result = creditCardToTest.getHolder();
        assertNotSame("Not equal. ",expResult, result);
       
    }

    
    @Test
    public void testWrongCreditCardDate() {
        
        String expResult = "11/21";
        String result = creditCardToTest.getDate();
        assertNotSame("Not equal. ",expResult, result);
        
    }
    
}
