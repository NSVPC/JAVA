package basics;

class a {}
class b extends a {}

class s1
{
	a D()
	{
		System.out.println("x");
		return new a();
	}
}

class s2 extends s1
{
	b D()
	{
		System.out.println("y");
		return new b();
	}
}
public class ovverride {

	public static void main(String[] args)
	{
		s2 t = new s2();
		System.out.println(t.D());
	}
}
