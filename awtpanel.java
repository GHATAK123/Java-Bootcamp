import java.awt.*;

public class awtpanel
{
    public static void main(String[] args)
    {
        Frame fr=new Frame("Frame in java AWT");
        Panel pl=new Panel();
        fr.setSize(500,500);
        fr.setBackground(Color.pink);
        fr.setLayout(null);
        pl.setSize(100,100);
        pl.setBackground(Color.yellow);
        fr.add(pl);
        fr.show();
        
    }
}