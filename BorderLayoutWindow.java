import javax.swing.*;
import java.awt.*;

public class BorderLayoutWindow {
    public static void main(String[] args) {
        // Create a JFrame with the title "Border Layout Window"
        JFrame frame = new JFrame("Border Layout Window");

        // Set the size of the window to 400x200
        frame.setSize(400, 200);

        // Command for the default close operation: Exit the JVM
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout of the frame to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create a JLabel for the north area
        JLabel northLabel = new JLabel("This is the North Border", JLabel.CENTER);
        
        // Create a JLabel for the south area
        JLabel southLabel = new JLabel("This is the South Border", JLabel.CENTER);

        // Add the labels to the frame
        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
