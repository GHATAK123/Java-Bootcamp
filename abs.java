// We cannot make the object of Abstract class but we can make a reference variable of abstract class.
// Abstract class can only be used as super class which is used to extends to make sub-classes.
abstract class person
{
    private String name;
    public int age;
    public void setName(String n)
    {
        name=n;
    }
    public void setAge(int a)
    {
        age=a;
    }
}
public class abs extends person
{
    public static void main(String[] args)
    {
        person p1= new abs();
        p1.age=5;
        System.out.print(p1.age);
}