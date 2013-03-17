/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LexicalAnalysis;

/**
 *
 * @author danyalrehman
 */
public class FloatingClass extends Token {
    
    public final float floatvalue;
    
    public FloatingClass(float x)
    {
        super(Type.FLOAT);
        this.floatvalue = x;
        
        
    }
    
    public String toString()
    {
        String str = "";
        str += this.floatvalue;
        
        return str;
    }
    
    
    
}
