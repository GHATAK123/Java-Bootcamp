// If the function is static then child class is hiding the parents class function as depicts in this example.
// If the function is non-static then parent class function is overriden in the child class function
class parent
{
    static int y=4;
    public static void f1()
    {
        System.out.println("Hello");
    }
}
    class child extends parent
    {
      static
      {
      y=5;// Static member variable not  inherited.
      }
         public static void f1()
    {
       System.out.println("HII bro");
    }
        
    }
    public class function_hiding
    {
        public static void main(String[] args)
        {
            child.f1(); // Function Hiding.
            System.out.println(parent.y);
        }
    }
