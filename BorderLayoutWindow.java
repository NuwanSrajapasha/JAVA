import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {

    JButton[] btnArr;
    JTextField textField;

    Calculator() {
        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); 

        Font font = new Font("null", Font.BOLD, 25);

        // Add the text field at the top
        textField = new JTextField();
        textField.setFont(font);
        textField.setHorizontalAlignment(JTextField.RIGHT); 
        add(textField, BorderLayout.NORTH);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] text = { "7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "-" };
        btnArr = new JButton[16];

        for (int i = 0; i < 16; i++) {
            btnArr[i] = new JButton(text[i]);
            btnArr[i].setFont(font);
            buttonPanel.add(btnArr[i]);
        }

        // Add the button panel to the center
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}

class Example {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
    }
}
