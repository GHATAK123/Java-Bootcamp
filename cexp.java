// Checked exception are compiled-time exception like IOException or ClassNotFoundException or SQLException or IllegalThreadStateException.
import java.io.*;
public class cexp
{
    public static void main(String[] args) 
    {
        try{
        throw new IOException();
        }
       // System.out.println("After Exception");
        catch(IOException e)
        {
            System.out.println("Exception : "+e.getMessage());    
        }
        
    }
}
    