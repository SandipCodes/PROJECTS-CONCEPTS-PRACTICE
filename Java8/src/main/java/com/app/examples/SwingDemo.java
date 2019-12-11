
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */

package com.app.examples;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Description: This class is intended to:
 * 
 * @author Sandip Humbe Written On: Dec 8, 2019
 */

public class SwingDemo extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	JTextField textField1;
	JTextField textField2;
	JTextField textField3;

	public SwingDemo() {
		this.setTitle("Calculator");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//this.getContentPane();
		this.setVisible(true);
		this.setDefaultLookAndFeelDecorated(true);
		this.setAutoRequestFocus(true);
		this.setLayout(new FlowLayout());

		createCalculator(this);
		// creating textboxes
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		textField3 = new JTextField(10);

		// setting size
		// adding action listerners to textfield

		textField1.addActionListener(this);
		textField2.addActionListener(this);
		textField3.addActionListener(this);

		// creating buttons
		button1 = new JButton("ADD");
		button2 = new JButton("SUB");
		button3 = new JButton("MUL");
		button4 = new JButton("DIV");
		// button1.setSize(100, 100);
		// setting size of buttons
		button1.setBounds(50, 350, 100, 70);
		button2.setBounds(100, 350, 100, 70);
		button3.setBounds(150, 350, 100, 70);
		button4.setBounds(200, 350, 100, 70);

		// setting colors to button
		button1.setBackground(Color.PINK);
		button2.setBackground(Color.PINK);
		button3.setBackground(Color.PINK);
		button4.setBackground(Color.PINK);

		// adding action listerners to buttons
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		// adding textfields to frame
		this.add(textField1);
		this.add(textField2);
		this.add(textField3);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);

		// additional properties
		this.setBackground(Color.GREEN);
	}

	private void createCalculator(JFrame f){
		 JPanel MyPanel = new JPanel();
		    
	   	 MyPanel.setLayout( new GridLayout(4, 3) );  // 4x3 Grid
	    
	   	 JButton x1  = new JButton("7");
	   	 JButton x2  = new JButton("8");
	   	 JButton x3  = new JButton("9");
	   	 JButton x4  = new JButton("4");
	   	 JButton x5  = new JButton("5");
	   	 JButton x6  = new JButton("6");
	   	 JButton x7  = new JButton("1");
	   	 JButton x8  = new JButton("2");
	   	 JButton x9  = new JButton("3");
	   	 JButton x10 = new JButton("0");
	   	 JButton x11 = new JButton(".");
	   	 JButton x12 = new JButton("CE");
	    
	   	 MyPanel.add(x1);
	   	 MyPanel.add(x2);
	   	 MyPanel.add(x3);
	   	 MyPanel.add(x4);
	   	 MyPanel.add(x5);
	   	 MyPanel.add(x6);
	   	 MyPanel.add(x7);
	   	 MyPanel.add(x8);
	   	 MyPanel.add(x9);
	   	 MyPanel.add(x10);
	   	 MyPanel.add(x11);
	   	 MyPanel.add(x12);
	    
	   	 f.getContentPane().add(MyPanel, "Center"); // Paste MyPanel into JFrame    
	    
	}

	public static void main(String[] args) {
		new SwingDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String tf1 = textField1.getText();
		String tf2 = textField2.getText();

		String reValue;
		if (tf1 == null || "".equals(tf1)) {
			JOptionPane.showMessageDialog(this, "value1 is required..");
			reValue = JOptionPane.showInputDialog("Enter Value");
			textField1.setText(reValue);
		}
		else if (! NumberUtils.isNumber(tf1)) {
			JOptionPane.showMessageDialog(this, "value1 is not a number..");
			reValue = JOptionPane.showInputDialog("Enter Again");
			textField1.setText(reValue);
		}
		else if (tf2 == null || "".equals(tf2)) {
			JOptionPane.showMessageDialog(this, "value2 is required..");
			reValue = JOptionPane.showInputDialog("Enter Value");
			textField2.setText(reValue);
		}
		else if (!NumberUtils.isNumber(tf2)) {
			JOptionPane.showMessageDialog(this, "value2 is not a number..");
			reValue = JOptionPane.showInputDialog("Enter Again");
			textField2.setText(reValue);
		}
		else {
		}
		int num1 = Integer.parseInt(tf1);
		int num2 = Integer.parseInt(tf2);

		if (e.getActionCommand() == "ADD") {
			int result = num1 + num2;
			textField3.setText(Integer.toString(result));
			JOptionPane.showMessageDialog(this, "Addition:" + result);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");

		} else if (e.getActionCommand() == "SUB") {
			int result = num1 - num2;
			textField3.setText(Integer.toString(result));
			JOptionPane.showMessageDialog(this, "Substration:" + result);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");

		} else if (e.getActionCommand() == "MUL") {
			int result = num1 * num2;
			textField3.setText(Integer.toString(result));
			JOptionPane.showMessageDialog(this, "Multiplication:" + result);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");

		} else {
			int result = num1 / num2;
			textField3.setText(Integer.toString(result));
			JOptionPane.showMessageDialog(this, "Division:" + result);
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");

		}
	}//
}// class
