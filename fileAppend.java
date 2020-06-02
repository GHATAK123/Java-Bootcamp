// Writing data to file means storing data in the file.
//FileOutputStream is meant for writing stream of raw bytes.
//FileOutputStream is subclass of OutputStream.
/* Constructor used in FileOutputStream
1.FileOutputStream(File file):Create a file output stream to write to the file represented by the specified File object.
2.FileOutputStream(File file,boolean append):Creates a file output stream to write to the file represented by the specified File object.
3.FileOutputStream(String name):Creates a file output stream to write to the file with the specified name.
4.FileOutputStream(String name,boolean append):Creates a file output stream to write to the file with the specified name.*/

import java.io.*;
public class fileAppend
{
    public static void main(String[] args) throws IOException 
    {
        int i;
        FileOutputStream fout=new FileOutputStream("l.txt",true);
        String s="TATA";
        char ch[]=s.toCharArray();
        for(i=0;i<s.length();i++)
            fout.write(ch[i]);
        fout.close();
        
    }
}