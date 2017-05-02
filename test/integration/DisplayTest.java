/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import integration.Display;
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


public class DisplayTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Display display;

@Before
public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    display = new Display();
}

@After
public void cleanUpStreams() {
    System.setOut(null);
    System.setErr(null);
}

    @Test
    public void testDisplay() {
        
        display.incrementNumber();
        System.out.print(display.toString());
        
        assertEquals("Now serving: 2", outContent.toString());
        
        
    }
    
    
    
}
