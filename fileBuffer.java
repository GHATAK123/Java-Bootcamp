/*BufferedWriter:
1.Writes text to a character-output stream,buffering characters so as to provide for the efficient writing of single characters ,arrays, and strings.
2.The buffer size may be specified ,or the default size may be accepted.The default is large enough for most purposes.
*/
/* BufferWriter Constructor
1.BufferedWriter(Writer out):Creates a buffered character-output stream  that uses a default-sized output buffer.
2.BufferedWriter(Writer out,int sz):Creates a new buffered character-output stream that uses a output buffer of the given size.*/

import java.io.*;
class fileBuffer
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw=new FileWriter("ghatak.txt",true);
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write(" Computer");
        bf.close();
    }
}