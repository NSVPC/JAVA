package basics;

/* 
 1. enum is shortcut for enumeration.
 2. enum y extends x  not possible ,it gives compiler error  [Inheritance concept is not possible for enums]
 3. All enums in java  are child classes of java.lang.Enum.
 4. every enum is final implicitly.
 
 

enum x
{
	
}

class z
{
	
}

these are :not possible

enum y extends x  
{
	
	
}

enum y extends java.lang.Enum
{

}

enum y extends z
{

}

class y extends x   (becuase every enum is final implicitly,if it is final,we cannot create class for it)
{

}

*/

enum  TrafficS
{
	RED,GREEN,ORANGE;
}

public class testing_enum3 {
	public static void main(String[] args)
	{
     TrafficS t = TrafficS.RED;
     TrafficS[] s = TrafficS.values();
     for(TrafficS s1:s)
     {
    	 System.out.println(s1);
    	 System.out.println(s1.ordinal());
     }
     
     System.out.println(t);
}
}