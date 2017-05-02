/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jocke
 */
public class InspectionChecklistTest {
    
    private InspectionChecklist list;
    
    @Before
    public void setUp() {
        list = new InspectionChecklist("lights", "Step 1: turn on lights...");
        
    }
    
    @After
    public void tearDown() {
        list = null;
    }

    
    @Test
    public void testGetInspectionId() {
        
        String expResult = "lights";
        String result = list.getInspectionId();
        assertEquals("message",expResult, result);
        
    }

    
    @Test
    public void testInspectionSteps() {
        
         String expResult = "Step 1: turn on lights...";
        String result = list.getInspectionSteps();
        assertEquals("message",expResult, result);
        
    }

    /**
     * Test of setInspectionId method, of class InspectionChecklist.
     */
    @Test
    public void testSetInspectionId() {
        
        String expinspectionId = "Tires";
        
        list.setInspectionId(expinspectionId);
        assertEquals("message",expinspectionId, list.getInspectionId());
    }

    /**
     * Test of setInspectionSteps method, of class InspectionChecklist.
     */
    @Test
    public void testSetInspectionSteps() {
        
        String expinspectionSteps = "Step 1,2,3 and 4: be awsome";
        
        list.setInspectionSteps(expinspectionSteps);
        assertEquals("message",expinspectionSteps, list.getInspectionSteps());
    }

    
}
