interface i1
{
    void f1();
}
interface i2
{
    void f2();
}
class A implements i1,i2
{
  public void f1()
  {
  
  }
  public void f2()
  {
  
  }
  public void f3()
  {
  
  }

}
public class intref
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.f1();
        obj.f2();
        obj.f3();
        I1 obj1 = new A(); // We cannot create object of interface but we can create refrence variable of interface.
        obj1.f1();
        obj1.f2();// Error
        obj1.f3();// Error
        I2 obj2 = new A(); // We cannot create object of interface but we can create refrence variable of interface.
        obj1.f1(); // Error
        obj1.f2();
        obj1.f3();// Error
        
        
    }
}