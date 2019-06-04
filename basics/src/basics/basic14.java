package basics;

/* Multi-level Inheritance */

class A1  /*Parent class */
{
	int a=20;
	void display()
	{
		System.out.println("A");
	}
}
 
class B1 extends A1    /* child class with respect to class A*/
{
	int b=10;
	void show()
	{
		System.out.println("B");
	}
	
}

class C1 extends B1    /* child class wiith respect to class B and also class A */
{
	int c=30;
	void dis()
	{
		System.out.println("C");
	}
	
}
public class basic14 {
	public static void main(String args[])
	{
		C1 obj=new C1();
		System.out.println(obj.c);
		obj.dis();
		System.out.println(obj.b);
		obj.show();
		System.out.println(obj.a);
		obj.display();
		
	}
}
