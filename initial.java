public class pure
{
    private int x;
    {
        Sysytem.out.println("Initialization Block: " + x);
        x=5;
    }
    public pure()
    {
        Sysytem.out.println("Constructor: " + x);
    }
    
    public static void main(String[] args)
    {
        pure i1=new pure();
        pure i2=new pure();
        
        
    }
}