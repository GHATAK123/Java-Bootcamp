class A
{
    int a=5;
    public A(int x)
    {
        a=x;
        System.out.println("A");
    }
}
class B extends A
{
   int b=4;
    public B()
    {
    // if parents class have default constructor, then there is no need of super.
    //if parents class have parametrized constructor, then super is mandatory with values as a arguments.
    // Compiler can only call the default constructor only.
        super(58); // It represent the constructor of a parents class 
        System.out.println("B");
    }
   
}
 public class cin
 {
     public static void main(String[] args)
     {
         B obj = new B();
         
         System.out.println(obj.a);
         
          
         
     }
 }