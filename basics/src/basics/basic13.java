package basics;

/* inheritance 
 1. Single inheritance
 2. Multi-level inheritance
 3. Hierarahical inheritance 
 These are the 3 inheritances supported in java 
 */
/* Single Inheritance example */
class Parent   /*Parent class */
{
	int a=20;
	void display()
	{
		System.out.println("PARENT");
	}
}
 
class child extends Parent    /* child class */
{
	int b=10;
	void show()
	{
		System.out.println("CHILD");
	}
	
}

public class basic13 {
	public static void main(String args[])
	{
		child obj=new child();
		System.out.println(obj.b);
		obj.show();
		System.out.println(obj.a);
		obj.display();
		
	}
}

