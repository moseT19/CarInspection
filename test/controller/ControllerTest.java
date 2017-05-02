/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.InspectionChecklist;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jocke
 */
public class ControllerTest {
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Test of callNextInspection method, of class Controller.
     */
    @Test
    public void testCallNextInspection() {
        System.out.println("callNextInspection");
        Controller instance = new Controller();
        instance.callNextInspection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enterRegNumber method, of class Controller.
     */
    @Test
    public void testEnterRegNumber() {
        System.out.println("enterRegNumber");
        String regnr = "";
        Controller instance = new Controller();
        double expResult = 0.0;
        double result = instance.enterRegNumber(regnr);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextInspection method, of class Controller.
     */
    @Test
    public void testNextInspection() {
        System.out.println("nextInspection");
        int i = 0;
        Controller instance = new Controller();
        InspectionChecklist expResult = null;
        InspectionChecklist result = instance.nextInspection(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeResult method, of class Controller.
     */
    @Test
    public void testStoreResult() {
        System.out.println("storeResult");
        int i = 0;
        String result_2 = "";
        Controller instance = new Controller();
        instance.storeResult(i, result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payment method, of class Controller.
     */
    @Test
    public void testPayment() {
        System.out.println("payment");
        double price = 0.0;
        Controller instance = new Controller();
        instance.payment(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
