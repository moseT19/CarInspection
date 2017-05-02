/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jocke
 */
public class InspectionTest {
    
    private Inspection insp;
    
    @Before
    public void setUp() {
        insp = new Inspection("abc123", 30);
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testCalculateCost() {
        Inspection insp1 = new Inspection("abc123", 10);
        Inspection insp2 = new Inspection("abc123", 20);
        Inspection insp3 = new Inspection("abc123", 30);
        ArrayList<Inspection> list = new ArrayList<>();
        list.add(insp1);
        list.add(insp2);
        list.add(insp3);
        String expResult = ""+60.0;
        String result = ""+Inspection.calculateCost(list);
        assertEquals("message", expResult, result);
        
    }
    
}
