package cc;

import java.applet.AudioClip;
import java.io.*;
import java.applet.Applet;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.swing.JFrame;

public class Music extends JFrame
{
	File f;
	URI uri;
	URL url;

	// Music(){
	// bgMusic();
	// }
	Music()
	{
		try
		{
			System.out.println("----- Begin -----");
			f = new File("Delacey.mav");
			System.out.println("S1: " + f);
			uri = f.toURI();
			System.out.println("S2: " + uri);
			url = uri.toURL(); // 解析地址
			System.out.println("S3: " + url);
			AudioClip aau;
			aau = Applet.newAudioClip(url);
			System.out.println("S4: " + aau);
			// aau.loop(); //循环播放
			aau.play();
		} catch (Exception e)
		{
			System.out.println("Not find the music");
			e.printStackTrace();
		}
		System.out.println("======== End ========");
	}

	/*
	 * public static void main(String args[]) { new Music(); }
	 */////

}