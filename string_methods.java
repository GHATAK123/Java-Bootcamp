import java.lang.String;
public class string_methods
{
    public static void main(String[] args)
    {
        String s1=new String("Computer");
        System.out.println(s1);
        String s2=s1.toUpperCase();
        System.out.println(s2);
        String s3=s2.toLowerCase();
          System.out.println(s3);
        int i=s1.indexOf('m');
        int i1=s1.indexOf('m',3); // Return -1, bcz it is not in the specified range of index.
              System.out.println(i);
         System.out.println(i1);
        int i2=s1.indexOf("ute");
         System.out.println(i2);
        int i3=s1.lastIndexOf('m');
        System.out.println(i3);
        //Comparing String function
        if(s1.equals(s2))
        {
            System.out.println("String are same");
        }
        else
        {
            System.out.println("String are not same");
        }
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("String are same");
        }
        else
        {
             System.out.println("String are not same");
        }
         int i4=s1.compareTo(s2); // Based on unicode differnce.
        if(i==0)
        {
            System.out.println("String are same");
        }
        else if(i>0)
        {
            System.out.println("ooposite to dictionary order");
        }
        else
        {
            System.out.println(" dictionary order");
        }
        String s4=s1.substring(4);
        String s5=s1.substring(2,4);
        System.out.println(s4);
         System.out.println(s5);
        
        
        
        
    }
}