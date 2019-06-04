package basics;

public class test_tostring {

	int id;
	String name;
	String work;
	int age;
	
	test_tostring()
	{
		this.id=1;
		this.name="ravi";
		this.work="job";
		this.age=30;
	}
	test_tostring(int id,String name,String work,int age)
	{
		this.id=id;
		this.name=name;
		this.work=work;
		this.age=age;
		
	}
	
   public  String toString()
	{
		return name + ":" + work;
	}
	
	public static void main(String[] args)
	{
		test_tostring t = new test_tostring(2,"raj","job",20);
		test_tostring t1 = new test_tostring();
		System.out.println(t1.name);
		
		System.out.println(t1.id);
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.work);
		System.out.println(t.age);
		System.out.println(t);
		System.out.println(t.toString());
	
		
		
		
	}
}
