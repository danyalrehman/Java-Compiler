/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author danyalrehman
 */
public class ReaderDirector {
    
    /* This method changes the output streams by redirecting them.
    *  This way one can change the output into either a
    *  file or a standard output depending on personal preference.
    * 
    */
    
    String opath;
    
    public ReaderDirector(String opath)
    {
        this.opath = opath;
    }
    
    public Reader create()
    {
        if (this.opath.equalsIgnoreCase("console")) 
        {
        
            return new Reader();
        
        }
        else
        {
            return new ReadFile(opath);
        }
    }
    
}
