package basics;

class test {
	static int a=10;   /*static variable */
	static void display() /* static method */
	{
		System.out.println("STATIC METHOD");
	}
	static  /* static block */
	{
		System.out.println("STATIC BLOCK");
	}
}
public class basic7
{

	public static void main(String args[])
	{
		System.out.println(test.a); 
		test.display();
		
	}

}

