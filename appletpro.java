/*Applet
1.An applet is a java program that runs in a web browser.
2.Applet is container class like Frame.
3.An applet is a java class that extends the java.applet.Applet class.
4.Applets are designed to be embedded within a HTML page.
5.When an user views an HTML page that contains an applet,the code for the applet is downloaded to the user's machine.
6.A JVM is required to view an applet.
7.The JVM on the user's machine creates an instance of the applet class and invokes various methods during the applet's lifetime.
*/
import java.applet.Applet;
import java.awt.*;
//<applet code="appletpro" width="300" height="200"> </applet>
public class appletpro extends Applet {
    public void paint(Graphics g)
    {
        g.drawString("trashpicker.ml",100,100);
    }
    
}
