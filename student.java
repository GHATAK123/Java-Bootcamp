package pack2;
public class student
{
    private int rollno;
    private String name;
    public void setRollno(int r)
    {
        rollno=r;
    }
    public void setName(String n)
    {
        name=n;
    }
    public int getRollno()
    {
        return(rollno);
    }
    public String getName()
    {
        return(name);
    }
}
// javac -d . student.java (for compile)