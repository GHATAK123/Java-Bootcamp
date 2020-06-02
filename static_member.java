class Example
{
    int x=2; //Instance Variable
    public static int y; // Static Variable
    public void fun1() // Instance member function
    {
      }
    public static void fun2() // static member function
    {
        System.out.println("This is Ststic member function");
    }
    static class Test
    {
        public static String country = "INDIA";
    }
}
    public class static_member
    {
        public static void main(String[] args)
        {
        Example ex1=new Example();
        Example.y=5; // Accesing static Variable.
        Example.fun2(); // Accessing Static Function.
        System.out.println(ex1.x);
        System.out.println(Example.y);
        System.out.println(Example.Test.country);
        }
    }