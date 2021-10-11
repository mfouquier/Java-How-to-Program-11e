package com.ch26_9;
import java.awt.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame {
	private final JButton[] buttons;
	private static final String[] names = 
		{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
	private final JPanel buttonPanel;
	private final JTextField textBox;
	private final JPanel textPanel;
	
	
	public CalculatorFrame() {
		super("Calculator");
		buttons = new JButton[16];
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4));
		
		Color color = new Color(124,218,240);
		textPanel = new JPanel();
		textBox = new JTextField(23);
		textBox.setEditable(false);
		textBox.setBackground(Color.WHITE );
        textPanel.setBackground(color);
		textPanel.add(textBox);
		
		for(int i = 0; i < names.length; i++) {
			buttons[i] = new JButton(names[i]);
			buttonPanel.add(buttons[i]);
		}
		
		add(buttonPanel, BorderLayout.SOUTH);
		add(textPanel, BorderLayout.NORTH);
	}
}
