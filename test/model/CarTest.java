package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import model.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jocke
 */
public class CarTest {
    
    private Car carToTest;
    
    
    @Before
    public void setUp() {
        carToTest = new Car("ABC123");
    }
    
    @After
    public void tearDown() {
         carToTest = null;
    }

    @Test
    public void testCar() {
        // TODO review the generated test code and remove the default call to fail.
        
        String expectedRes = "ABC123";
        String actualRes = carToTest.getRegNumber();
        assertEquals("The expected result was not the same as the actual result. ", expectedRes, actualRes);
        
    }
    
}
