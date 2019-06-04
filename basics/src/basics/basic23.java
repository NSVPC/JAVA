package basics;
import java.util.*;

public class basic23 {

	public static void main(String args[])
    { 
        List<String> l1 = new ArrayList<String>(5); // Type safe array list, stores only string
  
        l1.add("GeeksforGeeks"); 
        l1.add("Practice"); 
        l1.add("GeeksQuiz"); 
        l1.add("IDE"); 
        l1.add("Courses"); 
  
        List<String> range = new ArrayList<String>(); 
  
        range = l1.subList(2, 4); // Return List between 2nd(including) 
                                // and 4th element(excluding) 
  
        System.out.println(range);  
    } 
}
