
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */

package com.app.examples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Description: This class is written to demonstarte the Java8 features.:
 * 
 * @author Sandip Humbe Written On: Dec 7, 2019
 */

public class Java8Examples {

	/**
	 * 
	 * Description: This method is intended to implement Runnable interface using
	 * anonymous class with before and after Java 8 features: Java8Examples void
	 */
    
	JButton button=null;
	JFrame frame=null;
	
	/**
	 * 
	 */
	public Java8Examples() {
	
		 frame=new JFrame("My Frame");
		 frame.setSize(400, 300);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
		 
		 button=new JButton("press");
	     button.setSize(150, 100);
	     
	     //adding button to content pane of the frame
	     frame.getContentPane().add(button);
		 frame.setBackground(Color.GREEN);
		 frame.setVisible(true);
		 button.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, " button presses..");
			}
		});
	}
	public void method() {

		new Thread(new Runnable() {

			// before Java 8
			@Override
			public void run() {
				System.out.println("Java8Examples.method().new Runnable() {...}.run()");
			}
		}).start();
		;

		// with Java8 Features
		new Thread(() -> {
			System.out.println("Java8Examples.enclosing_method()");
		}).start();
		;

	}// method1()

	public void method1() {

	}

	public static void main(String args[]) {

		Java8Examples examples = new Java8Examples();
		examples.method();
		int b = 5;
		int x = 10, y = 5;
 
		int res=0;
		Calculator cal=null;
		
		Squre s = (a) -> a * a;
 		int squre = s.calSquare(b);
		System.out.println("squre:" + squre);

		s = (a) -> a * a * a;
		int cube = s.calSquare(b);
		System.out.println("Java8Examples.main()-cube:" + cube);

		// defining functional interface ops()
		// for addition
		 cal = (p, q) -> p + q;
		res = cal.ops(10, 6);
		System.out.println("Java8Examples.main()-add::" + res);

		// for sub
        cal = (p, q) -> p - q;
		res = cal.ops(10, 6);
		System.out.println("Java8Examples.main()-sub:" + res);

		// for mul
        cal = (p, q) -> p * q;
		res = cal.ops(10, 6);
		System.out.println("Java8Examples.main()-mul:" + res);

		// for div
        cal = (p, q) -> p/q;
		res = cal.ops(10, 6);
		System.out.println("Java8Examples.main()-div::" + res);

	}
	
}// class
