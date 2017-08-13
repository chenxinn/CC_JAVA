package cc;

import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import cc.*;




public class Main 
{
	public void MyThreadJob()
	{
		
	}
	
	
	public static void main(String[] args) //throws IOException
	{
		
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		
		Runnable r2 = new MyRunnable();
		Thread t2 = new Thread(r2);
		
		
		t.setName("T:");
		t2.setName("T2:");
		//t.start();
		//t2.start();
		
		System.out.println("Hello GitHub, thank you for geving a chance");
	}
}
