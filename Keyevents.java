import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Keyevents extends Applet implements KeyListener {
    String msg="";
    int X=10;
    int Y=20;
    public void init()
    {
        addKeyListener(this);
        requestFocus();
    }
    
    public void KeyPressed(Keyevents ke)
    {
        showStatus("Key Down");
    }
    public void KeyReleased(Keyevents ke)
    {
        showStatus("Key up");
    }
    public void KeyTyped(Keyevents ke)
    {
        msg += ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,X,Y);
    }
}
//<applet code="Keyevents.class" width=300 height=100></applet>