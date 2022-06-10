package sudoku_package;

import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import java.awt.event.*;


public class GUI implements ActionListener {
	JButton button;
	JLabel label;
	JFrame frame;
	JPanel panel;
	int count = 0;
	public GUI() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("Number of clicks: 0");
		button = new JButton("Click me");
		
		button.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	/**
	 * @author Jacob 
	 * @param ActionEvent e
	 * @return void
	 */
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of Clicks: " + count);
		
	}

}
