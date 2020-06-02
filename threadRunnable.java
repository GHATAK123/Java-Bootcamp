// A thread is a independent path of execution within a program.
// Many thread can run concurrently within a program.
// Multi threading  refers to two or more tasks executing concurrently within a single program.
// Every thread in a class is created and controlled by java.lang.Thread class.
// There are 2 ways to create threads
//1.By inmplementing runnable interface.(java.lang.Runnable)
//2.By extending the thread class.(java.lang.Thread)
class A implements Runnable
{
   public void run()
   {
   int i;
   for(i=0;i<=10;i++)
   System.out.println("Thread A"+i);
   }
}
class B implements Runnable
{
   public void run()
   {
   int i;
   for(i=0;i<=10;i++)
   System.out.println("Thread B"+i);
   }
}
public class threadRunnable
{
    public static void main(String[] args)
    {
        Thread t1=new Thread(new A());
        Thread t2=new Thread(new B());
        t1.start();
        t2.start();
    }
}
// Create object of thread class.
// Passing the object(as a parameter) of class which implements runnable interface in a thread class object.
//Call the start thread function.
//We need to override the run() methods into our class which is the only method that needs to be implenented.
//The thread ends when the run() method ends either by normal completion or by throwing an uncaught exception.