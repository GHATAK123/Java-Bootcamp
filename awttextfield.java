import java.awt.*;

public class awttextfield
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Label in AWT");
        TextField t1,t2;
        t1=new TextField("Enter Something in this textfield");
        t1.setBounds(50,100,100,30);
        t2=new TextField("Enter another thing in this text field");
        t2.setBounds(50,150,100,30);
        f.add(t1);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}