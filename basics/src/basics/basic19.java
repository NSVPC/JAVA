package basics;

/* Exception Handling */
public class basic19 {
  void display()
  {
	 try
	  {   int b[]=new int[5];
	      b[6]=12;
		  int a= 5/0;
		  
	  } 
	 catch(Exception e)
	 {
		 System.out.println(e);
		 //e.printStackTrace();
	 }
	  System.out.println("Exception Handled..");
	  
  }
  public static void main(String args[])
	{
		basic19 obj = new basic19();
		obj.display();
		
	}
}
