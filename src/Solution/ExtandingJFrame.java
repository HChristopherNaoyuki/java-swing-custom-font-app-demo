package Solution;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExtandingJFrame extends JFrame
{
    ExtandingJFrame() throws FontFormatException, IOException
    {
        JFrame frame = new JFrame("Java Practice!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JLabel instead of PopupMenu
        JLabel label = new JLabel("Hello from ExtendingJFrame!");
        label.setHorizontalAlignment(JLabel.CENTER);
        
        frame.add(label);
        frame.pack();
        frame.getContentPane().setBackground(Color.decode("#101010"));
        frame.setSize(720, 480);
        frame.setResizable(false);
        frame.setVisible(true);
        
        // Load custom font
        Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("PixelFont.ttf"));
        label.setFont(font.deriveFont(Font.BOLD, 12f));
    }
}
