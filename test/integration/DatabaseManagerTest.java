/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import Database.Database;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jocke
 */
public class DatabaseManagerTest {
    
    private Database db; 
    private DatabaseManager testdbM;
    
    @Before
    public void setUp() {
        db = new Database();
        testdbM = new DatabaseManager();
     
    }
    
    @After
    public void tearDown() {
        db = null;
        testdbM = null;
    }

   
    @Test
    public void testFindInspectionsByRegNr() {
        
        int expectedHits = 4;
        int actualHits = testdbM.findInspectionsByRegNr("abc123").size();
        assertEquals("Number of hits in database", expectedHits, actualHits);
        
    }
    
    @Test
    public void testStoreResult(){
        
        Inspection expRes = new Inspection("abc123", 40);
        expRes.getResult().setInspecResult("dummy test comment");
        
       
        testdbM.storeResult(0, "dummy test comment");
        
        String expResS = expRes.getResult().getInspecResult();
        String resS = db.inspectionsInDb.get(0).getResult().getInspecResult();
        System.out.println(resS+ ", " + expResS);
        assertEquals("message", expResS, resS);
        
    }

    
}
