
/**
 *
 * @author danyalrehman
 */

import java.io.*;

class Parser
{
    static int lookahead;
    
    public Parser() throws IOException
    {
        System.in.read();
    }
    
    void expression() throws IOException
    {
        
        term();
        while(true)
        {
            if (lookahead == '+')
            {
                match('+');
                term();
                System.out.write('+');
                
            }
            else if (lookahead == '-')
            {
                match('-');
                term();
                System.out.write('-');
                
            }
            else
            {
                return;
            }
            
        }  
    }
    void term() throws IOException
    {
        if(Character.isDigit((char)lookahead))
        {
            System.out.write((char)lookahead); 
            match(lookahead);
        }
        else
        {
            Error E1 = new Error("Syntax Error!");
            throw E1;
        }
    }

    void match(int num) throws IOException
    {
        if (lookahead == num)
        {
            lookahead = System.in.read();
        }
        else
        {
            Error E2 = new Error("Syntax Error!");
            throw E2;
        }
    }
}
public class Postfix {

    
    public static void main(String[] args) throws IOException {
        
        Parser P1 = new Parser();
        P1.expression();
        System.out.write('\n');
        
    }
}
