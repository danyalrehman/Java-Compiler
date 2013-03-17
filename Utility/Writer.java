/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.io.*;

/**
 *
 * @author danyalrehman
 */
public class Writer {
    
    public void write(String str)
    {
        System.out.println(str);
    }
    
    public void write(char c)
    {
        System.out.println(c);
    }
    
    public void close()
    {
        // Same as the method for reader and doensn't require a close 
        // function.
    }
    
    
}

class WriteFile extends Writer
{
    String path;
    BufferedWriter writer;
    
    public WriteFile(String path)
    {
        super();
        this.path = path;
        try
        {
            
            writer = new BufferedWriter(new java.io.FileWriter(this.path));
            
        }
        catch (IOException ex) 
        {
            
            System.out.println("Error writing to " + this.path + ": " + ex.getMessage());
            
        }
    }
    
    @Override
    public void write(String str)
    {
        try 
        {
            writer.write(str);
        }
        catch (IOException ex) 
        {
            System.out.println("Error writing file to " + this.path + ": " + ex.getMessage());
        }
    }
    
    
    @Override
    public void write(char c)
    {
        try 
        {
            writer.write(c);
        }
        catch (IOException ex) 
        {
            System.out.println("Error writing file to " + this.path + ": " + ex.getMessage());
        }
    }
    
    @Override
    public void close() {
        try 
        {
            this.writer.close();
        }
        catch (IOException ex) 
        {
            System.out.println("Error closing writer: " + ex.getMessage());
        }
    }
    
}
