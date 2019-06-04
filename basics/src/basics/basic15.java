package basics;

class A2 /*Parent class */
{
	int a=20;
	void display()
	{
		System.out.println("parent class");
	}
}
 
class B2 extends A2  /* child class with respect to class A2 */
{
	int a=10;
	void display()
	{   
		System.out.println("child class");
		System.out.println(a);
		super.display();
		System.out.println(super.a);
		
	}
	
}

public class basic15 {
	public static void main(String args[])
	{
		B2 obj=new B2();
		obj.display();
		
	}
}
   