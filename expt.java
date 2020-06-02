// own created exception java default catch
public class expt
{
    public static void main(String[] args)
    {
        int bal=7000;
        int wbal=8000;
        if(bal<wbal)
        {
            throw new ArithmeticException("Insufficient funds");
        }
        bal=bal-wbal;
        System.out.println("Transaction Successfully Completed ");
        System.out.println("Program continue.....");
        
    }
}