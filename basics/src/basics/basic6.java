package basics;

public class basic6 {
	String name;   /*instance variables */
	int rno;
	basic6()  /*default constructor */ 
	{
		name="ABC";
		rno=123;
	}
	basic6(String str,int n) /* Parameterized  constructor */ 
	{
		name=str;
		rno=n;
	}
		public static void main(String args[])
		{
			basic6 obj = new basic6();
			basic6 obj1 =new basic6("DEF",234);
			System.out.println(obj.name);
			System.out.println(obj.rno);
			System.out.println(obj1.name);
			System.out.println(obj1.rno);
			
		}
}

/* constructor  has two main rules 
 1. constructor name should be equal to class name
 2. constructor should not have any return type 
*/
