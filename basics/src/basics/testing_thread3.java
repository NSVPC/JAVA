package basics;

class me implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		try
		{
		System.out.println("Started Thread:"+Thread.currentThread().getName()+"sucessfully");
		Thread.sleep(1000);
	    }
		catch(Exception e)
		{
			System.out.println("Caught Exception");
		}
}
}
}

public class testing_thread3 {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new me());
		t1.start();
		System.out.println("............1............");
		Thread t2 = new Thread(new me());
		t2.start();
		System.out.println(".............2...........");
		
		
	}
}
