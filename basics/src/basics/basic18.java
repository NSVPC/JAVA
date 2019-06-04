package basics;

/* Interface (Multiple Inheritance)
 1. We implement interface to acheive Multiple inheritance,hybrid inheritance
 2. Two keywords
  		a)interface
  		b)implements
 3. In interface,we will have only abstract methods.
 4. We cannot create object for interfaces
 */

interface X
{
	
	void Adisplay();
	
}

interface Y
{
	void Bdisplay();
	
}

class AB implements X
{
	 public void Adisplay()
	{
		System.out.println("A DISPLAY");
		
	}
}

class AC implements X,Y
{
	public void Adisplay()
	{
		System.out.println("AC DISPLAY");
		
	}
	 public void Bdisplay()
	{
		System.out.println("B DISPLAY");
	}
	
}

public class basic18 {
	public static void main(String args[])
	{
		AB obj=new AB();
		AC obj1=new AC();
		obj.Adisplay();
		obj1.Adisplay();
		obj1.Bdisplay();
		
	}
}

