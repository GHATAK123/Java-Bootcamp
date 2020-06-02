//Reading data from the file means extracting data stored in the file(without deleting it from the file).
//FileInputStream is meant for reading streams of raw bytes.
//A FileInputStream obtains input bytes from a file in a file system.
/* Constructor used in FileInputStream
1.FileInputStream(File file):Creates a FileInputStream by opening a connection to an actual file,the file named by the File object file in the file system.
2.FileInputStream(String name):Creates a FileInputStream by opening a connection to an actual file,the file named by the path name in the file system.*/
import java.io.*;
class fileRead
{
    public static void main(String[] args) throws IOException
    {
        int i;
   
        FileInputStream fin=new FileInputStream("ghatak.txt");
        do
        {
            i=fin.read();
            if(i!=-1)
            
                System.out.print((char)i);
        }
            while(i!=-1);
            
                fin.close();
            
        
    }
}
