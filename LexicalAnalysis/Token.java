/*
 * This is the token class for Lexical Analysis
 * 
 */


package LexicalAnalysis;

/**
 *
 * @author danyalrehman
 */

public class Token {
    
    public int type;
    public Token(int x)
    {
        /*  Aim of this constructor is to take in a tuple.
         * 
         *  This tuple has a <type, value>
         *  For example (integ, 17) takes in an integer of value 17.
         */
        
        
        this.type = x;
        
    }
    
    public String toString()
    {
        // Aim of this is to return a string representation of the value taken
        
        String str = "";
        str += (char)type;
        
        return str;
    }
    
}
