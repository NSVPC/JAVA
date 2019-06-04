package basics;


public class testing_throw {

	public static void main(String[] args)
	{
		try
		{
		int a=2,b=9,res;
		res=a+b;
		if(res>10)
		{
			throw new ArithmeticException();
		}
	}
		catch(Exception e)
		{
			System.out.println("Bigger result");

		}
	finally
	{
		System.out.println("Print ka Baap");
	}
}
}
