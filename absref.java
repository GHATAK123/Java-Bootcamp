// We cannot make the object of Abstract class but we can make a reference variable of abstract class.
abstract class A
{
    abstract void show(); // Abstract Methods.
}
class B extends A
{
    void show() // Abstract class overidden, now we can make the object of this class.
    {
        System.out.println("B");
    }
}
public class absref
{
    public static void main(String[] args)
    {
        A a1=new B();  // Object of class B is stored in the reference variable of abstract class A.
        B b1=new B();
        a1.show();
        b1.show();
    }
}