import java.awt.*;

public class awtcheckbox extends Component
{
//    awtcheckbox()
//    {
//        Frame f=new Frame("Checkbox In AWT");
//        Checkbox checkbox1=new Checkbox("C++");
//        checkbox1.setBounds(100,100,50,50);
//         Checkbox checkbox2=new Checkbox("java",true);
//        checkbox2.setBounds(100,150,50,50);
//        f.add(checkbox1);
//        f.add(checkbox2);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//        
//        
//    }
    public static void main(String[] args)
    {
//        new awtcheckbox();
         Frame f=new Frame("Checkbox In AWT");
        Checkbox checkbox1=new Checkbox("C++");
        checkbox1.setBounds(100,100,50,50);
         Checkbox checkbox2=new Checkbox("java",true);
        checkbox2.setBounds(100,150,50,50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}