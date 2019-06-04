package basics;

/* Overloading (compile-time polymorphism)
1. Constructor Overloading
2. Method Overloading
3. Operator Overloading

All these terms we called as polymorphism,i.e executing the same thing in different ways.
this polymorphism in our java can be acheived by implementing this overloading concepts 
*/

class A   /* constructor overloading */
{
	A()
	{
		System.out.println("CONSTRUCTOR1");
	}
	A(int a)
	{
		System.out.println("a = " + a);
	}
}

class B   /* Method Overloading */
{
	void display()
	{
		System.out.println("DISPLAY");
	}
	
	void display(int a)
	{
		System.out.println("a = "+ a);
	}
	
}

class C  /*operator overloading  */
{ 
	void add()
	{
		int a=5,b=6;
		System.out.println("a + b = "+ a + b);
		System.out.println("a + b = "+ (a+b));
	}
		
}

public class basic10 {
	 public static void main(String args[])
	{
		A obj = new A();
		A obj1 = new A(2);
		B t1 = new B();
		t1.display();
		t1.display(12);
		C t2 = new C();
		t2.add();
	}
}
