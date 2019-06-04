package basics;

class zx extends Thread
{
	public void run()
	{
        for(int i=0;i<=10;i=i+2)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
	}
	
	
}

class zy extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=10;i=i+2)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
}
public class testing_threadx {

	public static void main(String[] args) {
		
		zx t1 = new zx();
		zy t2 = new zy();
		t1.start();
		try
		{
		t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		
	}

}
