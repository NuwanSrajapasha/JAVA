import javax.swing.*;
import java.awt.*;

public class StudentDetailForm extends JFrame {

    public StudentDetailForm() {
        // Frame settings
        setTitle("Student Detail Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Main panel with BorderLayout
        setLayout(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("Student Details Form", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        // Form Panel (Center area)
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns with gaps

        // Adding form components
        formPanel.add(new JLabel("Student Id:"));
        JTextField studentIdField = new JTextField();
        formPanel.add(studentIdField);

        formPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Address:"));
        JTextField addressField = new JTextField();
        formPanel.add(addressField);

        formPanel.add(new JLabel("Phone No:"));
        JTextField phoneNoField = new JTextField();
        formPanel.add(phoneNoField);

        add(formPanel, BorderLayout.CENTER);

        // Buttons Panel (South area)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton addButton = new JButton("Add Student");
        JButton cancelButton = new JButton("Cancel");
        buttonPanel.add(addButton);
        buttonPanel.add(cancelButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentDetailForm::new);
    }
}
