package basics;

class sd extends Thread
{
	public void run()
	{ 
		System.out.println("Thread started "+Thread.currentThread().getName());
	}
}

public class testing_threadpool {
   public static void main(String[] args)
   {
	   sd j = new sd();
	   j.setName("ravi");
	   j.start();
	   System.out.println(Thread.currentThread().getName());
	  
	   
   }
}
