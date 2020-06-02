import java.io.*;  
class Persist{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(400,"ghatu");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  FileInputStream fis=new FileInputStream("f.txt");
  ObjectInputStream ois=new ObjectInputStream(fis);
     Student s2=(Student) ois.readObject();
     
     System.out.println(s2.roll);
     System.out.println(s2.name);
     
 }  
}
class Student implements Serializable
{
    int roll;
    String name;
    Student(int r,String n)
    {
        roll=r;
        name=n;
    }
    
}