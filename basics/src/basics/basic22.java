package basics;

import java.util.List;
import java.util.ArrayList;

public class basic22 {

	public static void main(String args[])
    { 
      List<String> l1 = new ArrayList<String>(5);
      l1.add("Geeks");
      l1.add("for");
      l1.add("Geeks");
      l1.add("I");
      l1.add("Love");
      l1.add("It");
      System.out.println(l1);
      System.out.println("first index of Geeks:" + l1.indexOf("Geeks")); 
      System.out.println("last index of Geeks:" + l1.lastIndexOf("Geeks"));
      System.out.println("first index of Love:" + l1.indexOf("Love"));
      System.out.println("index of element" + " not present: "  + l1.indexOf("Ok"));
}

}
