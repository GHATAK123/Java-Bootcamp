/* Multiple Threads
When we start two or more threads within a program,there may be a situation when multiple threads try to access the same resources.
We have to synchronize the action of multiple threads and make sure that only one thread can access the resource at a given point in time.
*/
import java.util.Scanner;
class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal=bal;
    }
    public boolean isSufficientBalance(int w)
    {
        if(bal>=w)
            return(true);
        else
            return(false);
    }
    public void withdraw(int amt)
    {
        bal=bal-amt;
        System.out.println("Withdrawl money "+ amt);
        System.out.println("Your current Balance "+bal);
    }
}
class Customer implements Runnable
{
private String name;
private Account account;
public Customer(Account account,String n)
{
this.account=account;
name=n;
}
public void run()
{
Scanner kb=new Scanner(System.in);
synchronized(account){
System.out.println(name+"\nEnter the amount to be withdraw: ");
int amt=kb.nextInt();
if(account.isSufficientBalance(amt))
{
System.out.println(name);
account.withdraw(amt);
}
else
{
System.out.println("Insufficient Funds");
}
}
}
}
public class MultipleThread
{
    public static void main(String[] args)
    {
        Account a1=new Account(1000);
        Customer c1=new Customer(a1,"Ghatak");
        Customer c2=new Customer(a1,"Anand");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
        
    }
}
/*
synchronized(shared_resouce_identifier)
{
   //Access Shared vvvvvariables and other shared resources
}
*/