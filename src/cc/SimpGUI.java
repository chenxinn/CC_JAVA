package cc;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;

public class SimpGUI
{
	JButton button;

	public static void main(String[] args)
	{
		SimpGUI gui = new SimpGUI();
		gui.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		button = new JButton("Hello world!");

		button.addActionListener(new Button());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	class Button implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

			button.setText("I`ve been clicked!");
		}
	}

}
