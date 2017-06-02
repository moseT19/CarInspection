/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jocke
 */
public class InspectionResultTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private InspectionResult res;
    
    @Before
    public void setUp() {
        res = new InspectionResult(null, false);
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void tearDown() {
        res = null;
        System.setOut(null);
    }

   

    /**
     * Test of setInspecId method, of class InspectionResult.
     */
    @Test
    public void testSetInspecId() {
        
        String expInspecId = "lights";
        
        res.setInspecId(expInspecId);
        assertEquals("message", expInspecId, res.getInspecId());
        
    }

    /**
     * Test of setInspecResult method, of class InspectionResult.
     */
    @Test
    public void testSetInspecResult() {
        
        boolean inspecResult = true;
        
        res.setInspecResult(inspecResult);
        assertEquals("message", inspecResult, res.getInspecResult());
        
    }

    /**
     * Test of toString method, of class InspectionResult.
     */
    @Test
    public void testToString() {
        
        res.setInspecId("tostring");
        res.setInspecResult(true);
        System.out.print(res.toString());
        assertEquals("InspectionResult: Id: tostring Result: test tostring", outContent.toString());
        
        
    }
    
}
