package basics;



class op extends Thread
{
		public void run()
		{
			for(int i=0;i<5;i++)
			{
			System.out.println(Thread.currentThread().getName()+"sucessfully"+i);
		}
	
}
}

public class testing_threda2 {

	public static void main(String[] args)
	{
	op d = new op();
	d.start();
	
	for(int i=0;i<5;i++)
	{
		Thread.yield();
		System.out.println("Started"+Thread.currentThread().getName()+"sucessfully"+i);
		
	}
	
}
}
