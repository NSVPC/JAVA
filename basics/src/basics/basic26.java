package basics;
import java.util.*;
/* HashMap */

public class basic26 {
	 static void print(HashMap<String,Integer> m1)
		{
		 if(m1.isEmpty())
		 {
			 System.out.println("map is empty"); 
		 }
		 else
		 {
			 System.out.println(m1); 
		 }
			
		}
	 
	public static void main(String[] args)
	{
		HashMap<String,Integer> m1 = new HashMap<String,Integer>();
		
		print(m1);
		
		m1.put("vishal",10);
		m1.put("sachin", 20);
		m1.put("vaibhav", 30);
		
		
		System.out.println("Size of map is:"+m1.size());
		System.out.println(m1);
		
		print(m1);
		System.out.println("value for key \"vishal\" is:-"+m1.get("vishal"));
		m1.clear();
		System.out.println("Size of map is:"+m1.size());
		print(m1);
		
		
		
	}
		
		
		
		
}

