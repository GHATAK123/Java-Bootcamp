// own created exception as well as own catch mechanism
// due to my catch program will not end.
public class ownexpt
{
    public static void main(String[] args)
    {
        int bal=5000;
        int wbal=6000;
        try{
        if(bal<wbal)
        {
            throw new ArithmeticException("Insufficient funds");
        }
        bal=bal-wbal;
        System.out.println("Transaction Successfully Completed ");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: "+ e.getMessage());
        }
        System.out.println("Program continue.....");
        
    }
}