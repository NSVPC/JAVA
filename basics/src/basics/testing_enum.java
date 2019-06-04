package basics;

/*  
 1.to represent a group of named constants , we use enum.
 2.inside enum order of constants is important.
 
 3.Difference between enum and Enumeration:
 enum is a data type
 Enumeration is an interface
 
 
 */
enum Month
{
	JAN,FEB,MAR,APR,MY,DEC;
}

public class testing_enum {

	public static void main(String[] args)
	{
		Month t= Month.JAN;
		System.out.println(t);
		System.out.println(t.toString());
	}
}
