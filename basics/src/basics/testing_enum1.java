package basics;

enum Color
{
	RED,GREEN,BLUE;
	
	private Color()
	{
		System.out.println("System.out.println:"+ this.toString());
	}
	public void Colorinfo()
	{
		System.out.println("Universal Color");
	}
}
public class testing_enum1 {

	public static void main(String[] args)
	{
	Color t = Color.RED;
	System.out.println(t);
	System.out.println(t.toString());
	t.Colorinfo();
	}
}
