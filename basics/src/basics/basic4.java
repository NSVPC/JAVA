package basics;

public class basic4 {
	String name;   /*instance variables */
	int rno;
	basic4()  /*default constructor */ 
	{
		name="ABC";
		rno=123;
	}
		public static void main(String args[])
		{
			basic4 obj = new basic4();
			System.out.println(obj.name);
			System.out.println(obj.rno);
		}
}
