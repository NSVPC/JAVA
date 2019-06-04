package basics;

public class testing_StringBuilder {
	
	public static void main(String[] args)
	{
		 StringBuilder str = new StringBuilder("AAAABBBCCCC"); 
		 System.out.println(str.toString());
		 str.reverse();
		 System.out.println(str.toString());
		 StringBuilder str1 = new StringBuilder(10); 
		 System.out.println(str1.capacity());
	}
}
