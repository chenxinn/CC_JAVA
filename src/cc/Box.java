package cc;

import java.io.*;


public class Box implements Serializable 
{
	transient int aa;
	int bb;
	
	/*
	public static void main(String[] args)
	{
		Box mybox = new Box();
		mybox.aa = 66;
		mybox.bb = 77;
		
		
		try
		{
			FileOutputStream fileStream = new FileOutputStream("abcd.ser");
			
			ObjectOutputStream os = new ObjectOutputStream(fileStream);	
			os.writeObject(mybox);
			os.close();
		}
		catch (Exception ex)
		{
			System.out.println("Read file error!");
		}
			
		try
		{			
			FileInputStream file = new FileInputStream("abcd.ser");
			
			ObjectInputStream os = new ObjectInputStream(file);
			Object one = os.readObject();
			
			Box box = (Box) one;
			System.out.println("aa= " + box.aa + "   bb= " + box.bb);
			
			os.close();
		}
		catch (Exception ex)
		{
		}
	}
	*/
}
