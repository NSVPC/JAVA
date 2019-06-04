package basics;

import java.io.File;
import java.io.IOException;

public class testing_file1 {

	public static void main(String[] args) throws IOException {
		File f = new File("javaFile124.txt");
		System.out.println(f.createNewFile());
	     
		//apply File class methods on File object
		System.out.println("File name :" + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Absolute path:" + f.getAbsolutePath());
		System.out.println("Parent:" + f.getParent());
		System.out.println("Exists :" + f.exists());
	}

}
