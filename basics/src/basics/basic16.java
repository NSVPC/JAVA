package basics;

/* Method Overriding (Run-time polymorphism)

1. Method Overriding is implemented with the help of inheritance
2. Method name should be same in both Parent class and child class
3. Return type,scope,parameters of methods should be same in both parent class and child class
4. Methods declared as final in parent class cannot be overriden by child class
5. Static methods cannot be overriden

*/


class A3 /*Parent class */
{
	 void display()
	{
		System.out.println("parent class");
	}
}
 
class B3 extends A3  /* child class with respect to class A2 */
{
	
	void display()
	{   super.display();
		System.out.println("child class");
		
	}

	
}

public class basic16 {
	public static void main(String args[])
	{
		B3 obj=new B3();
		obj.display();
		
		
	}
}

/* Polymorphism

What is Polymorphism?

a. Implementing same thing in different ways.
   
   1.Compile-time polymorphism
       i. This can be achevied by implementing  overloading concepts(Constructor overloading,Method Overloading,Operator overloading)
	   ii. Compile-time polymorphism is called static Binding

   2.Run-time polymorphism
	   i. This can be achevied by implementing method overriding
       ii. Run-time polymorphism is called Dynamic Binding


*/