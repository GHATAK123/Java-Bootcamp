/*String readLine():Reads a line of text*/
import java.io.*;
public class Readline
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        FileReader fr=new FileReader("ghatak.txt");
        BufferedReader bf=new BufferedReader(fr);
        String s1;
        s1=bf.readLine();
        while((s1=bf.readLine())!=null)
        System.out.println(s1);
        bf.close();
        
        
    }
}