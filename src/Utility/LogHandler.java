package Utility;


import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  The loghandler class is responsible for logging exceptions into a text file and the console
 * @author jocke
 */
public class LogHandler {
    
    private PrintWriter logStream;
    
    
    /**
     * Constructor for the LogHanddler class, initiates a Printwriter which is used to print logs to a textfile
     * @throws IOException 
     */
    public LogHandler() throws IOException{
        
            logStream = new PrintWriter(new FileWriter("log.txt"),true);
        
    }
    
    /**
     * This method creates a string consisting of information regarding the current exception and logs it into a text file along with the console. 
     * @param e is the thrown exception
     */
    public void logException(Exception e){
        StringBuilder sb = new StringBuilder();
        Date date = new Date();
        sb.append("Exception thrown - ");
        sb.append(date.toString());
        sb.append("\n");
        sb.append(e.getMessage());
        
        
        System.out.println("\n" + sb.toString());
        e.printStackTrace();
        logStream.println(sb.toString());
        e.printStackTrace(logStream);
        logStream.close();
    }

}
