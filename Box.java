public class Box
{
    private int l,b,h;
    public Box()
    {
        l=10;b=5;h=3;
    }
      public Box(int L,int B,int H) // Constructor Overloading
      {
          l=L;b=B;h=H;
      }
    
    public static void main(String[] args)
    {
        Box b1=new Box();
        Box b2=new Box(30,5,6);
        System.out.println(b2.l);
        System.out.println(b1.l);
    }
}