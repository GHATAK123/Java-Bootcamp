import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="SimpleKey" width=300 height=100></applet>
public class Simplekey extends Applet implements KeyListener {
    String msg="";
    int x=10;
    int y=20;
    public void init()
    {
        addKeyListener(this);
        requestFocus();
    }
    public void KeyPressed(KeyEvent ke)
    {
        showStatus("Key down");
    }
     public void KeyReleased(KeyEvent ke)
    {
        showStatus("Key up");
    }
     public void KeyTyped(KeyEvent ke)
    {
        msg +=ke.getKeyChar();
         repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,X,Y);
    }
}