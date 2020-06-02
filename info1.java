package pack1;
import pack2.*;
public class info1
{
    public static void main(String[] args)
    {
        student s1 = new student();
        s1.setRollno(100);
        s1.setName("ghatak bro");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}
// javac -d . info1.java (for compile)
// java pack1.info1 (for run)