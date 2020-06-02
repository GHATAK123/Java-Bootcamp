// int read(char[] cbuf,int off,int len):Reads characters into a portion of an array
//char[]=String
//int off:index of array;
//int len:How many character we want to read. 
import java.io.*;
public class readfun
{
    public static void main(String[] args) throws IOException
    {
        
        FileReader fr=new FileReader("ghatak.txt");
        BufferedReader bf=new BufferedReader(fr);
        char []s=new char[20];
        bf.read(s,2,4);
        
       
     System.out.println(s);
        bf.read(s,0,19);
         System.out.println(s);
        bf.close();
        
        
    }
}


