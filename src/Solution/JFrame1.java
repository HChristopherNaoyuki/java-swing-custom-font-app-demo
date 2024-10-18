package Solution;

import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class JFrame1 
{
    public static void main(String[] args) throws IOException 
    {
        // Create an instance of ExtendingJFrame
        try
        {
            ExtandingJFrame extandingJFrame;
            extandingJFrame = new ExtandingJFrame();
        }
        catch (FontFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Font not found: " + e.getMessage());
        }
    }
}
