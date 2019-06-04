package basics;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* Vectors allow duplications and null like ArrayList 
 * Vector class implements a dynamic array that means it can grow or shrink as required.
 * They are very similar to ArrayList but Vector is synchronised and have some legacy method which collection framework does not contain.
 * 
 * */
public class testing_vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add("Raja");
		v.add("RaviShankar");
		v.add(4);
		System.out.println("Vector is :"+v);
		v.clear();
		v.add(2);
		v.add(3);
		System.out.println("Vector is :"+v);
		v.clear();  //clear the vector
		if(v.isEmpty())  //check vector is empty or not
		{
			System.out.println("Vector is clear");
		}
		v.add(2);
		v.add(3);
		v.add("ravijaya");
		v.add("ok");
		v.add("Geeks");
		v.add("Geeks");
		v.add(1);
		System.out.println("index of Geeks is: " + v.indexOf("Geeks")); 
		System.out.println("index of Geeks is: " + v.lastIndexOf("Geeks")); 
		System.out.println(v);
		System.out.println(v.firstElement()); //first element of vetor
		
		System.out.println(v.size());  //size of vector
		v.removeElement("Geeks");  //remove first of specific element in vector
		System.out.println(v);
		
		System.out.println(v.get(2)); //get element at index 2
		System.out.println("............");
		
		//print all elements present in vector
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("............");
		System.out.println(v.elementAt(3));
		
	}

}
