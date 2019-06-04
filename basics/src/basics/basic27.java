package basics;
import java.util.*;

/* HashMap entrySet() Method in Java */
public class basic27 {
	public static void main(String[] args) 
    { 
  
        // Creating an empty HashMap 
        HashMap<Integer,String> m1 = new HashMap<Integer,String>(); 
  
        // Mapping string values to int keys 
        m1.put(10, "Geeks"); 
        m1.put(15, "4"); 
        m1.put(20, "Geeks"); 
        m1.put(25, "Welcomes"); 
        m1.put(30, "You"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + m1); 
  
        // Using entrySet() to get the set view 
        System.out.println("The set is: " + m1.entrySet()); 
    } 
}
