//An abstract representation of file and directory pathnames.
import java.io.File;
import java.io.IOException;
public class fileClass
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("fileClass.txt");
        f1.createNewFile();
        System.out.println("Is Exist : "+f1.exists());
        System.out.println("file size: "+f1.length());
        System.out.println("can file read : "+f1.canRead());
        System.out.println("can write file: "+f1.canWrite());
        System.out.println("file name : "+f1.getName());
           // f1.delete();
        
    }
}