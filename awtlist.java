import java.awt.*;

public class awtlist
{
//    awtlist()
//    {
//        Frame f=new Frame("List in AWT");
//        List l=new List(4);
//        l.setBounds(100,100,75,75);
//        l.add("Item 1");
//         l.add("Item 2");
//         l.add("Item 3");
//         l.add("Item 4");
//         l.add("Item 5");
//        f.add(l);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
    public static void main(String[] args)
    {
//        new awtlist();
        Frame f=new Frame("List in AWT");
        List l=new List();
        l.setBounds(100,100,75,75);
        l.add("Item 1");
         l.add("Item 2");
         l.add("Item 3");
         l.add("Item 4");
         l.add("Item 5");
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}