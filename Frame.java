import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame{

	JButton northButton, eastButton, southButton, westButton, centerButton;

	Calculator(){
		setSize(500, 500);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		Font font = new Font("", 1, 25);
		northButton = new JButton("North");
		northButton.setFont(font);
		add("North", northButton);

		eastButton = new JButton("East");
		eastButton.setFont(font);
		add("East", eastButton);

		southButton = new JButton("South");
		southButton.setFont(font);
		add("South", southButton);

		westButton = new JButton("West");
		westButton.setFont(font);
		add("West", westButton);

		centerButton = new JButton("Center");
		centerButton.setFont(font);
		add("Center", centerButton);
		
		setVisible(true);
	}
}

class Example {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
	}
}

