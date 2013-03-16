/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LexicalAnalysis;

/**
 *
 * @author danyalrehman
 */
public class DoublesClass extends IntegerClass{
    
    public final double doublevalue;
    
    public DoublesClass(double x)
    {
        super(Type.INT);
        doublevalue = x;
    }
    
    public String toString()
    {
        String str = "";
        str = "Double = " + this.doublevalue + "(" + this.type + ")";
        
        return str;
    }
    
}
