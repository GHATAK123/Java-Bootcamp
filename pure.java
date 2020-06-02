//Instance Initialization Block
public class pure
{
    private int x;
    {
        System.out.println("Initialization Block: " + x);
        x=5;
    }
    public pure()
    {
        System.out.println("Constructor: " + x);
    }
    
    public static void main(String[] args)
    {
        pure i1=new pure();
        pure i2=new pure();
        
        
        
    }
}