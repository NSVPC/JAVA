package basics;

class  MultiThreading implements Runnable
{
	public void  run()
	{
		try
		{
		System.out.println("Thread started"+ Thread.currentThread().getName()+ "sucessfully");
	}
		catch(Exception e )
		{
			System.out.println("Caught Exception !!");
		}
}
	
}
public class testing_thread1 {
	
	public static void main(String[] args) 
	{
		
		for(int i=0;i<8;i++)
		{
			Thread t= new Thread(new MultiThreading());
			t.start();
		}

	}
}

