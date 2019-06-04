package basics;

public class basic12 {
	    int a=10;   /*instance variable */
		void display()
		{
			int a=20;   /*local variable */
			System.out.println(a);
			System.out.println(this.a); /* this keyword is used to access curent object variable */
			
		}
		public static void main(String args[])
		{
			basic12 obj = new basic12();
			System.out.println(obj.a);
			obj.display();
			
			
		}
}
