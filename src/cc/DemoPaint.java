package cc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DemoPaint
{

	/*
	 * public static void main(String[] args) { JFrame jf = new MyJFrame();
	 * jf.setBounds(160, 250, 300, 350); jf.setTitle("测试");
	 * jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); jf.setVisible(true);
	 * 
	 * Graphics g = jf.getRootPane().getGraphics(); g.setColor(Color.black);
	 * g.fillRect(150, 150, 30, 30);
	 * 
	 * 
	 * //为了让绘制的图形一直可视.可以使用Timer方法,每隔1000毫秒更新绘制一次.
	 * 
	 * Timer t = new Timer(1000, new ActionListener() {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) {
	 * 
	 * Graphics g = jf.getRootPane().getGraphics(); Graphics2D g2d =
	 * (Graphics2D) g;
	 * 
	 * int red = (int) (Math.random()*255); int grn = (int) (Math.random()*255);
	 * int blue = (int) (Math.random()*255); Color start = new Color(red, grn,
	 * blue);
	 * 
	 * red = (int) (Math.random()*255); grn = (int) (Math.random()*255); blue =
	 * (int) (Math.random()*255); Color end = new Color(red, grn, blue);
	 * 
	 * GradientPaint gradient = new GradientPaint(70, 70,start, 150, 150, end);
	 * 
	 * g2d.setPaint(gradient); g2d.fillOval(70, 70, 100, 700);
	 * System.out.println("方法一:Timer任务每隔1000毫秒 执行绘制蓝色矩形"); } });
	 * t.start();//开始执行Timer
	 * 
	 * }
	 */
}
// 写一个JFrame的子类

class MyJFrame extends JFrame
{

	public void paint(Graphics g)
	{// 系统自带的paint方法,自动调用
		super.paint(g);
		g.setColor(Color.ORANGE);// 白色
		g.fillRect(100, 100, 50, 50);
		System.out.println("方法二:系统调用了paint方法 执行绘制了白色矩形");
	}
}
