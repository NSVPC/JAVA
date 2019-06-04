package basics;

import java.util.*;

class DeprecatedTest 
{ 
    
    public void Display() 
    { 
    List words = new ArrayList();
    words.add(1);
    words.add("Saqw");
    System.out.println(words);
    } 
} 
  
public class testing_a1 
{ 
    // If we comment below annotation, program generates 
    // warning 
    @SuppressWarnings("unchecked") 
    public static void main(String args[]) 
    { 
        DeprecatedTest d1 = new DeprecatedTest(); 
        d1.Display(); 
    } 
} 