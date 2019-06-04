package basics;

enum dam
{
	RED(100),GREEN(90),BLUE(110),ORANGE;
	private int value;
	private dam(int x)
	{
		this.value=x;
	}
	private dam()
	{
		this.value=65;
	}
	public int getvalue()
	{
		return this.value;
	}
}
public class testing_enum4 {
	public static void main(String[] args)
	{
    dam t = dam.RED;
    dam[] s=dam.values();
    for(dam s1:s)
    {
    	System.out.println(s1+":....:"+s1.getvalue());
    }
}
}
