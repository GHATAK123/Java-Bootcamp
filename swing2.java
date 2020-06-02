// Swing Using extending the JFrame class in java.
import javax.swing.*;
public class swing2 extends JFrame
{
  public swing2()
  {
  
  }
  public swing2(String s)
  {
  super(s);
  }
    public static void main(String[] args)
    {
    swing2 jf=new swing2("Swing Using extending JFrame");
     jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}