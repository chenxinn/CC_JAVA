package cc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui3C
{
	JFrame frame;
	int x = 0;
	int y = 0;

	/*
	 * public static void main(String[] args) { SimpleGui3C gui = new
	 * SimpleGui3C(); gui.go(); }
	 */
	void go()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Click Here");
		button.addActionListener(new Button());
		frame.getContentPane().add(BorderLayout.WEST, button);

		frame.setSize(600, 600);
		frame.setVisible(true);
	}

	class Button implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int cnt;
			int red;
			int grn;
			int blue;
			int with;
			int leng;

			Graphics g = frame.getRootPane().getGraphics();

			for (cnt = 0; cnt < 600; cnt++)
			{
				// g.setColor(Color.WHITE);
				// g.fillRect(0, 0, 600, 600);
				red = (int) (Math.random() * 255);
				grn = (int) (Math.random() * 255);
				blue = (int) (Math.random() * 255);
				with = (int) (Math.random() * 50);
				leng = (int) (Math.random() * 50);

				Color start = new Color(red, grn, blue);
				g.setColor(start);
				g.fillRect(cnt, cnt, with, leng);
				try
				{
					Thread.sleep(50);
				} catch (Exception ex)
				{

				}
			}
		}
	}

}
