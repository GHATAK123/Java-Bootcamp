class A extends Thread
{
  public void run()
  {
     int i;
     for(i=0;i<=10;i++)
     System.out.println("Thread A" +i);
  }
}
class B extends Thread
{
  public void run()
  {
     int i;
     for(i=0;i<=10;i++)
     System.out.println("Thread B" +i);
  }
}
public class threadClass
{
    public static void main(String[] args)
    {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
        
    }
}