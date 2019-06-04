package basics;

class sp extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ "started");
	}
}

class sp1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ "started");
	}
}

public class testing_thread5 {
	public static void main(String args[])
	{
		sp t = new sp();
		t.setName("t1");
		t.setPriority(8);
		sp1 t1 = new sp1();
		t1.setName("t2");
		t1.setPriority(4);
		t.start();
		t1.start();
		System.out.println(t.getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		//t.setPriority(8);
		System.out.println(t.getPriority());
	}
}
