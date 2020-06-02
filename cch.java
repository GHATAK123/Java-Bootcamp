class A
{
    int a=5;
    public A()
    {
    
        System.out.println("A 1");
    }
}
class B extends A
{
  // int b=4;
    public B()
    {
    // Constructor can never contain super or this both.
        this(9);// It represents the constructor of the same class.
        System.out.println("B 1");
    }
     public B(int k)
    {
    
        System.out.println("B 2");
    }
   
}
 public class cch
 {
     public static void main(String[] args)
     {
         B obj = new B();
          
         
     }
 }