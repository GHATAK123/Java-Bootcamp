import java.util.*;
public class input
{
    public static void main(String[] args)
    {
        System.out.println("Enter your Name and age");
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}