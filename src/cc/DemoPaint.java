package cc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DemoPaint
{

	/*
	 * public static void main(String[] args) { JFrame jf = new MyJFrame();
	 * jf.setBounds(160, 250, 300, 350); jf.setTitle("����");
	 * jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); jf.setVisible(true);
	 * 
	 * Graphics g = jf.getRootPane().getGraphics(); g.setColor(Color.black);
	 * g.fillRect(150, 150, 30, 30);
	 * 
	 * 
	 * //Ϊ���û��Ƶ�ͼ��һֱ����.����ʹ��Timer����,ÿ��1000������»���һ��.
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
	 * System.out.println("����һ:Timer����ÿ��1000���� ִ�л�����ɫ����"); } });
	 * t.start();//��ʼִ��Timer
	 * 
	 * }
	 */
}
// дһ��JFrame������

class MyJFrame extends JFrame
{

	public void paint(Graphics g)
	{// ϵͳ�Դ���paint����,�Զ�����
		super.paint(g);
		g.setColor(Color.ORANGE);// ��ɫ
		g.fillRect(100, 100, 50, 50);
		System.out.println("������:ϵͳ������paint���� ִ�л����˰�ɫ����");
	}
}
