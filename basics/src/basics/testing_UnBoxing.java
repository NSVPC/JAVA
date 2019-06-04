package basics;

import java.util.ArrayList;

public class testing_UnBoxing {

	public static void main(String[] args)
	{
		
		Character ch = 'a';
		char b = ch;   // unboxing - Character object to primitive conversion 
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(25);
		int a = arrayList.get(0);  // unboxing because get method returns an Integer object
		System.out.println(a);
		
	}
}
