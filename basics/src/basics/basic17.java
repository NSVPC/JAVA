package basics;

/* abstract class and methods 
 
 abstract method:
 	* Only declaration but no definition.
 	
 abstract class:
 	* class contains atleast one abstract mathod.
 	* implementation of abstract methods will be written in derived class 
 	* object cannot be created for abstract class
 	
 concrete class:
    * object can be instantiated
    * class contains complete definition for all methods.
    
 */

abstract class A4 /*Parent class */
{
	abstract void display();
	
}
 
abstract class B4 extends A4  /* child class with respect to class A4 */
{
	
	void display()
	{   
		System.out.println("class A4");
		
	}
   abstract void show();
}

class C4 extends B4  /* child class with respect to class B4 */
{
	
	void show()
	{   
		System.out.println("class B4");
		
	}
}

public class basic17 {
	public static void main(String args[])
	{
		C4 obj=new C4();
		obj.display();
		obj.show();
		
		
	}
}
