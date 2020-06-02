class A // Parent class
{
    int z; //instance member variable
    public void f1()
    {
        System.out.println("Class A");
    }
}
class B extends A // Sub-class
{
    int z=8; //instance member variable
    public void f1()
    {
        System.out.println("Class B");
        super.f1(); // Call the f1() of parents Class A.
    }
    public void f2()
    {
        int z=2; //local variable
        // local variable defined in f2()
        System.out.println(this.z=5); // instance member variable of class B
        System.out.println(super.z=9); // instance member variable of class A.
    }
    
}
public class super_keyword
{
    public static void main(String[] args)
    {
        B obj = new B(); // obj is reference variable only with points to object of class B.
        obj.f1();
        System.out.println(obj.z);
        obj.f2();
        
    }
}