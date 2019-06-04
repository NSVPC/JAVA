package basics;
import java.util.*;

/*Map Interface */

public class basic24 {

	public static void main(String[] args)
	{
		Map<String,String> m1= new HashMap<String,String>();
		m1.put("myname", "navin");
		m1.put("actor", "john");
		m1.put("ceo", "marisa");
		m1.put("actor","akshay");
		
		System.out.println(m1);
		System.out.println(m1.get("myname"));
		System.out.println(m1.get("myname1"));
		 
		Set<String> s1 = m1.keySet();
		System.out.println(s1);
		for(String key : s1)
		{
			System.out.println(key + " " + m1.get(key));
		}
	}
}