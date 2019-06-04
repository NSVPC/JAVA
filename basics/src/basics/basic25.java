package basics;
import java.util.*;

public class basic25 {
 public static void main(String[] args)
 {
	 Map<String,Integer> m1 = new HashMap<String,Integer>();
	 m1.put("d", 100);
	 m1.put("b", 200);
	 m1.put("c", 300);
	 m1.put("a", 400);
	 System.out.println(m1);
	 System.out.println(m1.get("a"));
	 System.out.println("Size of map is :" + m1.size());
	 
	 Set<String> s1 = m1.keySet();
	 for(String key : s1)
	 {
		 System.out.println(key+":"+m1.get(key));
	 }
 }
}
