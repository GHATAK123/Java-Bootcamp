import java.lang.String;
// String class is final class,it cannot be extended.
// String class is immutable class , once created and initialized , cannot be changed on a same reference.
   
        public class string
        {
            public static void main(String[] args)
            {
                String s1="computer";
                String s2="computer";
                String s3=new String("computer");
                System.out.println(s1==s2);
                System.out.println(s1.equals(s2));
                System.out.println(s1==s3);
                System.out.println(s1.equals(s3));
                // All String reference denotes the same String object.
    String str1 = "PRAKASH ANAND"; // object creation of class String.
    String str2 = "PRAKASH ANAND"; // No object creation only new reference variable is created.
    String str3 = "PRAKASH " + "ANAND"; // No object creation only new reference variable is created.
        String str4=new String("PRAKASH ANAND");// By the help of new keyword.
        String str5=new String("PRAKASH ANAND"); //new object is created every times with the help of new keyword.
                
            }
        }