import java.awt.*;

public class awttextarea
{
    public static void main(String[] args)
    {  
//        new awttextarea();
        Frame f=new Frame("TextArea in AWT");
        TextArea area;
        area=new TextArea("uerhrgudhfewjuffig");
        area.setBounds(10,30,300,300);
        f.add(area);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}