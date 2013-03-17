/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.net.*;
import java.io.*;

/**
 *
 * @author danyalrehman
 */
public class Reader {
    
    
    public char read() 
    {
        try
        {
            return (char)System.in.read();
        }
        catch (IOException ex)
        {
            System.out.println("Error reading this message! <3" + ex.getMessage());
            return ' ';
        }
    }
    
    public void close()
    {
        // There is no need for an operation here
    }
   
}

class ReadFile extends Reader
{
    
    // This class is so that the Reader can get the name of the file
    // directly from the file path itself.
    
    
    String path;
    BufferedReader reader;
    
    public ReadFile(String path)
    {
        
        
        super();
        this.path = path;
        
        try 
        {
            
            reader = new BufferedReader(new java.io.FileReader(path));
            
        }
        catch (IOException ex) 
        {
            
            System.out.println("Error when creating reader " + this.path + ": " + ex.getMessage());
            
        }
    }
    
    @Override
    public char read()
    {
        try 
        {
            int x = reader.read();
            
            return (char)x;
        }
        catch (IOException ex) 
        {
            System.out.println("Error reading file from " + this.path + ": " + ex.getMessage());
            char c = ' ';
            return c;
            
        }
    }
    
    @Override
    public void close()
    {
        // This time a close function is required once reading is complete.
        
        try 
        {
         
            this.reader.close();
        
        }
        catch (IOException ex) 
        {
        
            System.out.println("Error closing file reader: " + ex.getMessage());
        
        }
    }
    
    
}
