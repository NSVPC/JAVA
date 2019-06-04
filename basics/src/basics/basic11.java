package basics;

public class basic11 {
	    int a=5,b=6;
		void add()
		{
			
			System.out.println("a + b = "+ a + b);
			System.out.println("a + b = "+ (a+b));
		}
		public static void main(String args[])
		{
			basic11 obj = new basic11();
			System.out.println(obj.a);
			obj.add();
			
			
		}
}
