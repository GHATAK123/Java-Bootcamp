// Both type of function(static or non-static) can be inherited from parents class to child class.
class parent
{
    public static void f1()
    {
        System.out.println("This is static function inherited from parents class");
    }
}
    class child extends parent
    {
        
    }
    public class inheritence
    {
        public static void main(String[] args)
        {
            child c=new child();
            parent p1=new parent();
                p1.f1();
            parent.f1();
            c.f1();
            child.f1(); // static member function inheritence.
            
        }
    }
