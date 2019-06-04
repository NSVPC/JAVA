package basics;

public class basic2 {

	static int a=10; /*static variable */
	int b=20; /*instance  variable */
	public static void main(String args[])
	{
		int c=30; /*local  variable */
		System.out.println(a);
		System.out.println(c);	
		basic2 obj = new basic2(); /*object creation */
		System.out.println(obj.b);
	}
}
