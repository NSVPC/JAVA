package basics;

import java.util.ResourceBundle;


public class testing_RB {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("basics.db");
        System.out.println(rb.getString("driver"));
	}

}


/*

ResourceBundle is a abstract class , present in java.util package

Java.util.ResourceBundle


File should save as : name.properties

*/