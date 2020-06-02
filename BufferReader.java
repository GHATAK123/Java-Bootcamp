/* BufferedReader
1.Reads text from a character-input stream,buffering characters so as to provide for the efficient reading of characters,array,and lines.
2.The buffer size may be specified,or the default size may be used.
*/
/*Constructor in BufferedReader
1.BufferedReader(Reader in):Creates a buffering character-input stream that uses a default-sized input buffer.
2.BufferedReader(Reader in,int sz):Creates a buffering character-input stream that uses an input buffer of the specified size.
*/
/*String readLine():Reads a line of text*/
/*  */
import java.io.*;
public class BufferReader
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        FileReader fr=new FileReader("ghatak.txt");
        BufferedReader bf=new BufferedReader(fr);
        while((ch=bf.read())!=-1)
        {
            System.out.print((char)ch);
        }
        bf.close();
    }
}
