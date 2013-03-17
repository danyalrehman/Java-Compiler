/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author danyalrehman
 */
public class SyntaxError extends Error {
    
    /* The aim of this file is to print the syntax error
     * when there is a mistake in syntax.
    */ 
    
    public SyntaxError(String errormessage)
    {
        super(errormessage);
    }
    
}
