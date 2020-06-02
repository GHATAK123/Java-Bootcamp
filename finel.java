/*
 final instance variable(It can only be assigned only once.) Value defaut blank 
 final static variable ( Value defaut blank )
 final local variable ( Value defaut blank ) (It can only be assigned only once)
 final class (No one can make the subclass or child class of this class).
 final methods (Methods declared as final cannot be overrided.)
 */
final class Dummy // This class can't be extended or inherited by any means.
{
    
}
class parent
{
    public void final expense()
    {
        
    }
}
class son extends parent
{
    public void expense() // Give Error due to overriding  of  final methods declared in parents class.
    {
        
    }
}

}
 public class finel
 {
     private final int x;//final instance member variable
     private final static int y; //final static member variable
     finel()  //Initialization final instance member variable using Constructor.
     {
         x=5;
     }
  /*  { Initialization final instance member variable using Initialization block.
         x=5;
     }*/
     static //Initialization final static member variable using Static Block.
     {
         y=4;
     }
     public void fun()
     {
        final int k; // final local variable (It cannot be used before initilization.) 
     }
     

     public static void main(String[] args)
     {
         finel f1=new finel();
     }
 }