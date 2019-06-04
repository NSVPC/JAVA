package basics;

enum stage
{
	RED,GREEN,BLUE;
	private stage()
	{
		System.out.println("The Constant used here:"+this.toString());
	}
}
public class testing_enum2 {

	public static void main(String[] args)
	{
		stage t = stage.RED;
		switch(t)
		{
		case RED:
			System.out.println("THE NAMED CONSTANT IS  RED");
			break;
		case GREEN:
			System.out.println("THE NAMED CONSTANT IS  GREEN");
			break;
		case BLUE:
			System.out.println("THE NAMED CONSTANT IS  BLUE");
			break;
		default:
			System.out.println("Nothing is executed");
			break;
			
		}
	}
}
