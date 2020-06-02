import java.awt.*;

public class awtscrollbar
{
//    awtscrollbar()
//    {
//        Frame f=new Frame("ScrollBar in AWT");
//        Scrollbar s=new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
//        s.setBounds(100,100,75,75);
//    
//        f.add(s);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
    public static void main(String[] args)
    {
//        new awtscrollbar();
        Frame f=new Frame("ScrollBar in AWT");
        Scrollbar s=new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        s.setBounds(100,100,200,200);
    
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}