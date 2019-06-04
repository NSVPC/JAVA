package basics;

/* List Interface
 1.Duplicates are allowed
 2.Insertion order should be preserved
 3.Using index,we can differentiate duplicates
 4.It is the child interface of Collection
  */
import java.util.List;
import java.util.ArrayList;


public class basic21 {

	public static void main(String args[])
	    { 
	      List<Integer> l1 = new ArrayList<Integer>();  // Creating a list
	      l1.add(0,1); //add 1 at index 0
	      l1.add(1,2);  //add 2 at index 1
	      System.out.println(l1);
	      
	      List<Integer> l2 = new ArrayList<Integer>(); // Creating another list
	      l2.add(1);
	      l2.add(2);
	      l2.add(3);
	      System.out.println(l2);
	      
	      l1.addAll(1,l2); //add list l2  from index 1
	      System.out.println(l1);
	      
	      l1.remove(1); //remove element from index 1
	      System.out.println(l1);
	      
	      System.out.println(l1.get(3)); //print element at index 3
	      
	      l1.add(0, 5);
	      System.out.println(l1);
	      
	      l1.remove(0);
	      System.out.println(l1);
	      
	      l1.set(0,5);     //replace element in index 0 with 5
	      System.out.println(l1);
}
}
