import java.util.*;
public class wrapper
{
    public static void main(String[] args)
    {
        Integer i1 = Integer.valueOf("123");
        Double d1=Double.valueOf("3.14");
        int a=Integer.parseInt("123");
        double b = Double.parseDouble("13.45");
        int c=i1.intValue();
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(c);
        System.out.println(a);
    }
}