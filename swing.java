/* Swing
** Java provides a rich set of library to create GUI.
** Swing API is set of extensible GUI Components to ease developer's life to create java based fron end/GUI Applications.
** It is build upon top of AWT API and acts as replacement of AWT API as it has almost every control corresponding to AWT controls.
** Swing is a light weight,offers rich controls and highly customizable.
** To use swing API,import javax.swing.*;.
** Swing UI elements
-- JFrame
-- JButton
-- JLabel
-- JCheckBox
-- JRadioBUtton and Many More..
*/
import javax.swing.*;
public class swing
{
    public static void main(String[] args)
    {
       
        JFrame jf=new JFrame("Swing");
         jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}