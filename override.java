class A
{
    public void f1(int x)
    {
      System.out.println("Class A");  
    }
}
class B extends A
{
    
    public void f1(int x) //Method or Function Overriding
    {
      System.out.println("Class B");
    }
}
public class override
{
    public static void main(String[] args)
    {
        B b1=new B();
        
        b1.f1(5);
        A a1=new A();
        a1.f1(5);
        
       
        
    }
}