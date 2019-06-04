package basics;



/* Thread creation by extending Thread class or implementing Runnable interface */

class MultiThread extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("Thread"+Thread.currentThread().getId()+"is running");
	}
		catch(Exception e)
		{
			System.out.println("Exception caught here");
		}
}
}


public class testing_thread {
     public static void main(String[] args)
     {
    	for(int i=0;i<8;i++)
    	{
    	   MultiThread obj = new MultiThread();
    	   obj.start();
     
}
     }    

}
