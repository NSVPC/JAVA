package basics;

import java.util.ArrayList;

/*
We convert primitive data types into objects using wrapper classes available in java.lang package


primitive data types(there are 8 primitive data types):      Wrapper Class
1.int						 Integer
2.float						 Float
3.char						 Character
4.boolean					 Boolean
5.byte						 Byte
6.short						 Short
7.long						 Long
8.double				     Double

non-primitive data types(referencial data types):

Boxing or AutoBoxing and UnBoxing :

The process of binding primitive data types into wrapper class objects is known as Boxing Process
The process of taking primitive data types out of wrapper class objects is known as UnBoxing Process
*/

public class testing_AutoBoxing {
  
	public static void main(String[] args)
	{
		char ch ='a';
		Character b = ch; // Autoboxing- primitive to Character object conversion
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(25);
		System.out.println(arrayList.get(0));  // printing the values from object 
	}
}
