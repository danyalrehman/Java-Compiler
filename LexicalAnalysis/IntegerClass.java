/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LexicalAnalysis;

/**
 *
 * @author danyalrehman
 */
public class IntegerClass extends Token {
    
    public int intvalue;
    public IntegerClass(int x)
    {
        super(Type.INT);
        intvalue = x;
    }
    
    public String toString()
    {
        String str = "";
        str += (char)intvalue;
        
        return str;
    }
    
    
    
}
