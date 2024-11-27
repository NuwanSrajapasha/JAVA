// File: EqualizerDemo.java
import javax.swing.*;
import java.awt.*;

public class EqualizerDemo {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Equalizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("Equalizer", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Panel for sliders
        JPanel sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridLayout(1, 10, 10, 0)); // 10 sliders, evenly spaced

        // Add sliders to the panel
        for (int i = 0; i < 10; i++) {
            JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 50); // Default value is 50
            slider.setMajorTickSpacing(25);
            slider.setPaintTicks(true);
            slider.setPaintTrack(true);
            slider.setPaintLabels(false);

            sliderPanel.add(slider);
        }

        // Add the slider panel to the frame
        frame.add(sliderPanel, BorderLayout.CENTER);

        // Show the frame
        frame.setVisible(true);
    }
}
