package basics;
import java.util.*;
import java.io.*;

public class basic1 {
	public static void main(String args[])
	{
/* read input from keyboard at the runtime in java using Scanner class */		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String name  = sc.next();
		System.out.println("Enter Integer");
		int a = sc.nextInt();
		System.out.println("Enter Float");
		float b = sc.nextFloat();
		System.out.println("Enter Double");
		double c = sc.nextDouble();
	}
	
}
