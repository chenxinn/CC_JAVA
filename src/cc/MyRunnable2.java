package cc;

public class MyRunnable2  implements Runnable
{
	int cc = 0;
	
	public void run()
	{
		int bb = 0;
		String threadname = Thread.currentThread().getName();
		
		while(bb == 0)
		{
			System.out.println(threadname + "cc = " + cc++);
			try 
			{
				Thread.sleep(1000);
			}
			catch (Exception ex)
			{
				
			}
		}
	
	}
}
