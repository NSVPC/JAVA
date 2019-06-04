package basics;

/* StringBuffer is class */

public class basic9 {
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("WELCOME "); /* initialize some string to StringBuffer object 'str' */
		System.out.println(str);
		
		str.append("JAVA ");
		System.out.println(str);
		
		str.insert(8,"TO ");
		System.out.println(str);
		
		str.delete(8,11);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		str.reverse();
		
		str.replace(0,1,"Hi W");
		System.out.println(str);
		
		System.out.println(str.length());
		
		int a=str.indexOf("WEL");
		System.out.println(a);
		System.out.println(str.indexOf("WEL"));
		
		System.out.println(str);
		System.out.println(str.charAt(9));
		
		System.out.println(str);
		System.out.println(str.subSequence(3,10));
		
	}
}



/* StringBuffer Methods 
1.append
2.insert
3.delete
4.reverse
5.replace
6.length
7.subString
8.indexOf
9.charAt
10.subSequence
*/
