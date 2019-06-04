package basics;

/*
String vs StringBuffer vs StringBuilder


If the content is fixed and does not change frequently,then we need to go to String concept
i.e String objects are immutable

If the content is not  fixed and keep on changing frequently,then we need to go to either StringBuffer
or StringBuilder because StringBuffer and StringBuilder objects are mutable



If the content is not  fixed and keep on changing frequently,but thread safety is required(at a time only one thread is allowed to operate on  my object),then we need to go to StringBuffer concept

If the content is not  fixed and keep on changing frequently,and also  thread safety is not required,then we need to go to StringBuilder concept

*/
public class testing_string {

	public static void main(String[] args)
	{
		String s = new String("GeeksforGeeks"); // or String s = "GeeksforGeeks";
		System.out.println(s);
		System.out.println("String Length is:" + s.length());
		System.out.println("Character at 3rd position:"+s.charAt(3));
		System.out.println("Substring  " + s.substring(3));
		System.out.println(s.concat("123"));
		System.out.println(s);
	}
}
