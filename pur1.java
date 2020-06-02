public class pur1
{
private static int k;
    static
    {
        System.out.println("Static Initilization Block "+k);
        k=10;
    }
    public static void main(String[] args)
    {
      //  new pur1();
        //pur1.k=5;
        
    System.out.println(pur1.k);
        
    }
}