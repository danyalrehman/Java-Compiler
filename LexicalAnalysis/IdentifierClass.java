/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LexicalAnalysis;

/**
 *
 * @author danyalrehman
 */
public class IdentifierClass extends Token{
    
    public final String lexeme;
    
    public static final IdentifierClass
            and = new IdentifierClass("&&", Type.AND),
            or = new IdentifierClass("||", Type.OR),
            equalto = new IdentifierClass("==", Type.EQ),
            notequal = new IdentifierClass("!=", Type.NE),
            lessthan = new IdentifierClass("<=", Type.LT), 
            greatherthan = new IdentifierClass(">=", Type.GT),
            subtract = new IdentifierClass("minus", Type.MINUS),
            True = new IdentifierClass("true", Type.TRUE),
            False = new IdentifierClass("false", Type.FALSE),
            temp = new IdentifierClass("t", Type.TEMP);
    
    IdentifierClass(String input, int value)
    {
        super(value);
        
        lexeme = input;
    }
    
    public String toString()
    {
        String str = "";
        str += this.lexeme;
        
        return str;
    }
            
    
    
    
}
