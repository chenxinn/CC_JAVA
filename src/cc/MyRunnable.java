package cc;

public class MyRunnable implements Runnable
{
	int aa = 0;

	public void run()
	{
		int bb = 0;
		String threadname = Thread.currentThread().getName();

		while (bb == 0)
		{
			System.out.println(threadname + "aa = " + aa++);
			try
			{
				Thread.sleep(1000);
			} catch (Exception ex)
			{

			}
		}
	}

}
