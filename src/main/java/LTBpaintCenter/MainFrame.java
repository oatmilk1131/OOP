package LTBpaintCenter;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame
{
    public MainFrame()
    {
        super("LTB Paint Center");
        
        // To show the POS panel
        POSView view = new POSView();
        setContentPane(view);

        // Fixed size
        setSize(1920, 1080);

        // Center on screen
        setLocationRelativeTo(null);

        // Disable resizing
        setResizable(false);

        // Close when exit is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Blank background
        getContentPane().setBackground(Color.WHITE);

        // Show window
        setVisible(true);
    }
}
