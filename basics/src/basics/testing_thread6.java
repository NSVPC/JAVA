package basics;

public class testing_thread6 {

	
	public static void main(String[] args) {

		try
		{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	    Thread.currentThread().join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
