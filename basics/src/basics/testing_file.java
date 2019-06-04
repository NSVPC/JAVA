package basics;

import java.io.File;
import java.io.IOException;


public class testing_file {

	public static void main(String[] args) 
	{
		try{
		File f = new File("javaFile123.txt");
		if(f.createNewFile())
		{
			System.out.println("New File is created!");
		}
		else
		{
			System.out.println("File already exists");
		}
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
}
}